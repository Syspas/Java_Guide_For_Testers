package org.Step1JavaOOPBeginning.HomeWork.Task4;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;

    /**
     * Конструктор для инициализации списка продуктов.
     */
    public Store() {
        products = new ArrayList<>();
    }

    /**
     * Метод для добавления продукта в магазин.
     * 
     * @param product продукт, который нужно добавить
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Метод для удаления продукта из магазина.
     * 
     * @param product продукт, который нужно удалить
     */
    public void removeProduct(Product product) {
        products.remove(product);
    }

    /**
     * Метод для получения общей стоимости всех продуктов в магазине.
     * 
     * @return общая стоимость всех продуктов
     */
    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    /**
     * Метод для получения списка всех продуктов в магазине.
     * 
     * @return список всех продуктов
     */
    public List<Product> getProducts() {
        return products;
    }
}