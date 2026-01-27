package day1.CodeRepoCleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class CodeRepoCleaner {

    private static final Map<FileType, List<File>> fileMap = new EnumMap<>(FileType.class);
    private static final List<Path> allJavaFiles = new ArrayList<>();

    static {
        for (FileType type : FileType.values()) {
            fileMap.put(type, new ArrayList<>());
        }
    }

    public static void main(String[] args) throws Exception {

        Path root = Paths.get("source");

        scanFiles(root);

        categorizeFiles();

        printSummary();

        filterLargeFiles(5 * 1024);
    }

    private static void scanFiles(Path root) throws IOException {

        Files.walk(root)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(allJavaFiles::add);
    }

    private static void categorizeFiles() {

        allJavaFiles.forEach(path -> {
            try {
                File file = path.toFile();
                FileType type = JavaFileAnalyzer.analyze(file);
                fileMap.get(type).add(file);
            } catch (Exception e) {
                fileMap.get(FileType.ERRORS).add(path.toFile());
            }
        });
    }

    private static void printSummary() {

        System.out.println("\n Code Repository Analysis Summary\n");

        fileMap.forEach((type, files) -> {
            System.out.println(" " + type + " Files: " + files.size());
            files.forEach(f -> System.out.println("   " + f.getName()));
            System.out.println();
        });
    }

    private static void filterLargeFiles(long size) {

        System.out.println("\n Files larger than " + size / 1024 + " KB\n");

        allJavaFiles.stream()
                .map(Path::toFile)
                .filter(f -> f.length() > size)
                .forEach(f -> System.out.println(f.getName() + " → " + f.length() / 1024 + " KB"));
    }
}