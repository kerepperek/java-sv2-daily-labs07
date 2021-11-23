package day02;

import org.junit.jupiter.api.Test;

import java.nio.file.NoSuchFileException;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void testaddMovies() {
        MovieService movieService = new MovieService("src/test/resources/movies.csv");
        assertEquals(5, movieService.getMovies().size());
        assertEquals("James Cameron", movieService.getMovies().get(1).getProducer());
    }

    @Test
    void testFillMoviesFileNotFound() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new MovieService("movies.txt"));
        assertEquals("Nem található az elérési úton a file!", e.getMessage());
        assertEquals(NoSuchFileException.class, e.getCause().getClass());
    }
}