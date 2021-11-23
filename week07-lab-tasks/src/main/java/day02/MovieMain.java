package day02;

public class MovieMain {

    public static void main(String[] args) {
        MovieService ms=new MovieService("week07-lab-tasks/src/main/resources/movies.csv");
        System.out.println(ms.movies.toString());
    }
}
