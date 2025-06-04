package com.example.models;

public class OrderDetails {
    private int id;
    private int orderId;
    private int productId;
    private int quantity;
    private double price;
    private double discount;
    private double vat;
    private double totalValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getTotalValue() {
        totalValue=(quantity*price-discount/100*quantity*price)*(1+vat/100);
        return totalValue;
    }

    public OrderDetails() {
    }

    public OrderDetails(int id, int orderId, int productId, int quantity, double price, double discount, double vat, double totalValue) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.vat = vat;
        this.totalValue = totalValue;
    }
}
