package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MovieService {
    List<Movie> movies=new ArrayList<>();
    List<String> lines;

    public MovieService(String path) {
        List<String> names;
        try {
           List<String> lines = Files.readAllLines(Paths.get(path));
            fillListWithMovies(lines);
        }
        catch (IOException e) {
           throw new IllegalArgumentException("Nem található az elérési úton a file!");
        }
    }

    public List<Movie> getMovies() {
        return movies;
    }

    private void fillListWithMovies(List<String> lines){
        for(String s :lines){
          String[] line=s.split(";");
          movies.add(new Movie(line[0], Integer.parseInt(line[1]),line[2]));
        }
    }

}
