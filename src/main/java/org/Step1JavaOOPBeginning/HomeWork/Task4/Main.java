package org.Step1JavaOOPBeginning.HomeWork.Task4;

public class Main {
    public static void main(String[] args) {
        // Создание продуктов
        Product apple = new Product("Apple", 0.5, 100);
        Product bread = new Product("Bread", 1.5, 50);
        Product milk = new Product("Milk", 0.9, 200);

        // Создание магазина и добавление продуктов
        Store store = new Store();
        store.addProduct(apple);
        store.addProduct(bread);
        store.addProduct(milk);

        // Вывод всех продуктов в магазине
        System.out.println("Продукты в магазине:");
        for (Product product : store.getProducts()) {
            System.out.println(product);
        }

        // Удаление продукта
        store.removeProduct(bread);

        // Вывод всех продуктов после удаления одного из них
        System.out.println("Продукты в магазине после удаления хлеба:");
        for (Product product : store.getProducts()) {
            System.out.println(product);
        }

        // Вычисление и вывод общей стоимости продуктов в магазине
        double totalPrice = store.getTotalPrice();
        System.out.println("Общая стоимость продуктов в магазине: $" + totalPrice);
    }
}