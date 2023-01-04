import com.kevinbooms.Files.FileIO;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FileIOTest {

    @Test
    void writerShouldWriteToTextFile() {
        var fileIoSut = new FileIO();
        assertEquals("test.txt", fileIoSut.writeFile("test"));
    }

    @Test
    void readerShouldReadFile() {
        var fileIOSut = new FileIO();
        assertEquals("test.txt", fileIOSut.readFile("test"));
    }
}
