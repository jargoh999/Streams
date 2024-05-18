import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonReaderExampleTest {

    @Test
    void collectAndConvertValues() {

        assertEquals(12000.0, JsonReaderExample.collectAndConvertValues("C:\\Users\\DELL\\Documents\\testFolder\\test.json"));
    }
}