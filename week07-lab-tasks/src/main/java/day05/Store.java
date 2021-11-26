package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        if(p.getSaleDate().isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Late date!");
        }
        products.add(p);
    }
    public void filteredListWriteToFile(int yearMonth, Path folder){
        List<String> filteredProducts=getFilteredList( yearMonth);

        try {
            Files.write(Paths.get(folder.toString()+"/"+yearMonth+".txt"), filteredProducts);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
    private List<String> getFilteredList(int yearMonth){

        List<String> filteredProducts=new ArrayList<>();
        for(Product prod:products){
            if(prod.getSaleDate().getYear()*100+prod.getSaleDate().getMonthValue()==yearMonth){
                filteredProducts.add(prod.toString());
            }
        }
        return filteredProducts;
    }

    public List<Product> getProducts() {
        return products;
    }
}
