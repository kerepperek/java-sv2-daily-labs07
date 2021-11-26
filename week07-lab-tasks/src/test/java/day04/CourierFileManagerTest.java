package day04;

import day02.MovieService;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CourierFileManagerTest {

    @Test
    void testInputFile() {
        Courier courier = new Courier();
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> new CourierFileManager().inputCourierByFile(Paths.get("src/test/resources/rides.txt"), courier));
        assertEquals("Invalid ride!", e.getMessage());
    }

    void testInputFileFailed() {
        Courier courier = new Courier();
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> new CourierFileManager().inputCourierByFile(Paths.get("src/test/resources/rides.txt"), courier));
        assertEquals("Not readable file.", e.getMessage());
    }
}