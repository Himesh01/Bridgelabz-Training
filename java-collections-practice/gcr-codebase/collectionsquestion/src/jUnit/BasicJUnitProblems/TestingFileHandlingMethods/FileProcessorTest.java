package jUnit.BasicJUnitProblems.TestingFileHandlingMethods;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.nio.file.*;
import org.junit.jupiter.api.*;

public class FileProcessorTest {

    private static final String TEST_FILE = "test.txt";
    FileProcessor processor;

    @BeforeEach
    void setup() {
        processor = new FileProcessor();
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(Paths.get(TEST_FILE));
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "JUnit File Testing";

        processor.writeToFile(TEST_FILE, content);
        String result = processor.readFromFile(TEST_FILE);

        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(TEST_FILE, "Hello");

        assertTrue(Files.exists(Paths.get(TEST_FILE)));
    }

    @Test
    void testReadFileNotFoundException() {
        assertThrows(FileNotFoundException.class, () -> {
            processor.readFromFile("no_such_file.txt");
        });
    }
}