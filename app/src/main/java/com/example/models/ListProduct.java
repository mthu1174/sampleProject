package com.example.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class ListProduct implements Serializable {
    private ArrayList<Product> products;

    public ListProduct() {
        products = new ArrayList<>();
    }

    public ListProduct(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void generateSampleData() {
        Random rand = new Random();
        for (int i = 1; i <= 20; i++) {
            int id = i;
            String name = "Product " + i;
            int quantity = rand.nextInt(100);
            double price = rand.nextDouble() * 1000;
            int cateId = (i % 3) + 1; // 1-3
            String description = "Sample description for product " + i;

            Product p = new Product(id, name, quantity, price, cateId, description);
            addProduct(p);
        }
    }

    public ArrayList<Product> getProductsByCategoryId(int categoryId) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getCate_id() == categoryId) {
                result.add(p);
            }
        }
        return result;
    }
}

