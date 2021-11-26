package day04;


import java.nio.file.Paths;

public class CourierMain {

    public static void main(String[] args) {
        CourierFileManager courierFileManager=new CourierFileManager();
        Courier courier=new Courier();
        try {
           courierFileManager.inputCourierByFile(Paths.get("week07-lab-tasks/src/main/resources/rides.txt"),courier);

        }catch(IllegalArgumentException e){
            System.out.println(courier.getRides());
            System.out.println(e);
        }
    }

}
