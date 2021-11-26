package day04;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CourierFileManager {

    public void inputCourierByFile(Path path,Courier courier) {
        List<String> allRows;
        try {
            allRows = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalArgumentException("Not readable file.");
        }
        getRows(allRows,courier);
    }

    private void getRows(List<String> allRows,Courier courier) {

        for (String row : allRows) {
            String[] data = row.split(" ");
            courier.addRide(new Ride(
                    Integer.parseInt(data[0]),
                    Integer.parseInt(data[1]),
                    Integer.parseInt(data[2])
            ));
        }
    }
}
