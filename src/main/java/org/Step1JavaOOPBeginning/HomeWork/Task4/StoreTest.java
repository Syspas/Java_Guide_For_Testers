package org.Step1JavaOOPBeginning.HomeWork.Task4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class StoreTest {

    private Store store;
    private Product apple;
    private Product bread;
    private Product milk;

    @BeforeEach
    public void setUp() {
        store = new Store();
        apple = new Product("Apple", 0.5, 100);
        bread = new Product("Bread", 1.5, 50);
        milk = new Product("Milk", 0.9, 200);
    }

    @Test
    public void testAddProduct() {
        store.addProduct(apple);
        List<Product> products = store.getProducts();
        assertTrue(products.contains(apple), "Продукт Apple должен быть добавлен в магазин");
    }

    @Test
    public void testRemoveProduct() {
        store.addProduct(bread);
        store.removeProduct(bread);
        List<Product> products = store.getProducts();
        assertTrue(!products.contains(bread), "Продукт Bread должен быть удален из магазина");
    }

    @Test
    public void testGetTotalPrice() {
        store.addProduct(apple);
        store.addProduct(bread);
        store.addProduct(milk);
        double expectedTotalPrice = apple.getTotalPrice() + bread.getTotalPrice() + milk.getTotalPrice();
        assertEquals(expectedTotalPrice, store.getTotalPrice(), "Общая стоимость продуктов рассчитана неверно");
    }
}