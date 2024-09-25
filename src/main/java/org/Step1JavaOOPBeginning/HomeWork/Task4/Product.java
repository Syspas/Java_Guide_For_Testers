package org.Step1JavaOOPBeginning.HomeWork.Task4;

public class Product {
    private String name;
    private double price;
    private int quantity;

    /**
     * Конструктор с параметрами.
     * 
     * @param name название продукта
     * @param price цена продукта
     * @param quantity количество продукта
     */
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters и Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Метод для получения общей стоимости продукта на складе.
     * 
     * @return общая стоимость продукта
     */
    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quantity=" + quantity + '}';
    }
}