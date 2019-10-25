package org.own.springtest;

public class Product {

    private String name;
    private float price;
    private float stock;

    public Product() {
    }

    public Product(String name, float price, float stock) {
        this.setName(name);
        this.setPrice(price);
        this.setStock(stock);
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
    }
}