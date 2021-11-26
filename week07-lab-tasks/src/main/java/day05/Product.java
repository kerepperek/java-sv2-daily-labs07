package day05;

import java.time.LocalDate;
import java.util.Date;

public class Product {

    private String prodName;
    private LocalDate saleDate;
    private double prodPrice;

    public Product(String prodName, LocalDate saleDate, double prodPrice) {
        this.prodName = prodName;
        this.saleDate = saleDate;
        this.prodPrice = prodPrice;
    }

    public String getProdName() {
        return prodName;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    @Override
    public String toString() {
        return prodName + ";" + saleDate + ";" + prodPrice;
    }
}
