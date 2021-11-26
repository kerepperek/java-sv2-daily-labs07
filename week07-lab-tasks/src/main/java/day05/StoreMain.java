package day05;


import java.nio.file.Paths;
import java.time.LocalDate;

public class StoreMain {
    public static void main(String[] args) {
        Store store=new Store();
        store.addProduct(new Product("Kalamári", LocalDate.of(2021,11,10),34.23));
        store.addProduct(new Product("Homár", LocalDate.of(2021,10,3),2.23));
        store.addProduct(new Product("Kalamári", LocalDate.of(2021,10,19),1.1));
        store.addProduct(new Product("Hering", LocalDate.of(2021,11,05),3.23));

        store.filteredListWriteToFile(202111, Paths.get("week07-lab-tasks/src/main/resources/"));
    }


}
