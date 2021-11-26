package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store = new Store();

    File tmpFolder = new File("");

    @BeforeEach
    void init() {
        store.addProduct(new Product("Kalamári", LocalDate.of(2021, 11, 10), 34.23));
        store.addProduct(new Product("Homár", LocalDate.of(2021, 10, 3), 2.23));
        store.addProduct(new Product("Kalamári", LocalDate.of(2021, 10, 19), 1.1));
        store.addProduct(new Product("Hering", LocalDate.of(2021, 11, 05), 3.23));

    }

    @Test
    void testAddProduct() {
        store.addProduct(new Product("Kalamári", LocalDate.of(2021, 10, 19), 1.1));
        assertEquals(5, store.getProducts().size());
    }

    @Test
    void testAddProductFailed() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> store.addProduct(new Product("Kalamári",
                        LocalDate.of(2021, 12, 19),
                        1.1)));
        assertEquals("Late date!", e.getMessage());
    }

    @Test
    void testFilteredListWriteToFile() throws IOException {
        Path path = tmpFolder.toPath();
        store.filteredListWriteToFile(202111, path);
        path = tmpFolder.toPath().resolve("/202111.txt");
        List<String> result = Files.readAllLines(path);
        assertEquals("Hering", result.get(1).split(";")[0]);
    }


}