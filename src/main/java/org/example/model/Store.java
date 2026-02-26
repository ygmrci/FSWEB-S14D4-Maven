package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Tatlı", 25, "Sütlü çikolata");
        products[1] = new Coke("İçecek", 15, "Soğuk kola");
        products[2] = new Bread("Gıda", 10, "Tam buğday ekmek");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }

    }
}