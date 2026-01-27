package day1.CodeRepoCleaner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class JavaFileAnalyzer {

    private static final Pattern METHOD_PATTERN =
            Pattern.compile("\\b(public|private|protected)?\\s+\\w+\\s+([A-Z]\\w*)\\s*\\(");

    private static final Pattern IMPORT_PATTERN =
            Pattern.compile("^import\\s+([\\w\\.]+);", Pattern.MULTILINE);

    public static FileType analyze(File file) throws IOException {

        String content = readFile(file);

        boolean hasBadMethodNames = detectBadMethodNames(content);
        boolean hasUnusedImports = detectUnusedImports(content);

        if (hasBadMethodNames) return FileType.ERRORS;
        if (hasUnusedImports) return FileType.WARNINGS;

        return FileType.VALID;
    }

    private static boolean detectBadMethodNames(String text) {
        Matcher m = METHOD_PATTERN.matcher(text);
        return m.find();
    }

    private static boolean detectUnusedImports(String text) {

        Set<String> imports = new HashSet<>();
        Matcher m = IMPORT_PATTERN.matcher(text);

        while (m.find()) {
            String imp = m.group(1);
            imports.add(imp.substring(imp.lastIndexOf('.') + 1));
        }

        for (String imp : imports) {
            if (!text.contains(imp + " ")) return true;
        }

        return false;
    }

    private static String readFile(File file) throws IOException {
        return new String(java.nio.file.Files.readAllBytes(file.toPath()));
    }
}