import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class FileProcessorTest {

    private static final String TEST_FILE = "testfile.txt";

    @Test
    void testWriteAndReadFromFile() throws IOException {
        String content = "Hello, JUnit!";
        FileProcessor.writeToFile(TEST_FILE, content);
        assertEquals(content, FileProcessor.readFromFile(TEST_FILE));
    }

    @Test
    void testFileExistsAfterWriting() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Test content");
        assertTrue(Files.exists(Path.of(TEST_FILE)));
    }

    @Test
    void testReadNonExistentFile() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"));
    }
}
