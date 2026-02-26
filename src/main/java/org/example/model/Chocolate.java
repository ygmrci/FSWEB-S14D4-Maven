package org.example.model;

public class Chocolate extends ProductForSale {

    private String country;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("Ürün Tipi: " + getType());
        System.out.println("Fiyat: " + getPrice());
        System.out.println("Açıklama: " + getDescription());
        System.out.println("Ülke: " + country);
    }
}
