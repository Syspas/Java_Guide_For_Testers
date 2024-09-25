# Магазин продуктов

## Описание
Этот проект реализует классический пример магазина продуктов с использованием двух основных классов: `Product` и `Store`. Класс `Product` хранит информацию о продукте, в то время как класс `Store` управляет коллекцией продуктов.

## Структура проекта
- `src/main/java/`
  - `Product.java`
  - `Store.java`
  - `Main.java`
- `src/test/java/`
  - `StoreTest.java`

## Класс Product
Класс `Product` имеет следующие поля и методы:
- **Поля:**
  - `name` (String): название продукта.
  - `price` (double): цена продукта.
  - `quantity` (int): количество продукта.

- **Методы:**
  - `Product(String name, double price, int quantity)`: конструктор для создания объекта продукта.
  - `double getTotalPrice()`: возвращает общую стоимость продукта (цена * количество).

### Класс Store
Класс `Store` имеет следующие поля и методы:
- **Поля:**
  - `products` (List<Product>): список продуктов в магазине.

- **Методы:**
  - `Store()`: конструктор для инициализации списка продуктов.
  - `void addProduct(Product product)`: добавляет продукт в магазин.
  - `void removeProduct(Product product)`: удаляет продукт из магазина.
  - `double getTotalPrice()`: возвращает общую стоимость всех продуктов в магазине.
  - `List<Product> getProducts()`: возвращает список всех продуктов в магазине.

## Пример использования
```java
public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", 0.5, 100);
        Product bread = new Product("Bread", 1.5, 50);
        Product milk = new Product("Milk", 0.9, 200);

        Store store = new Store();
        store.addProduct(apple);
        store.addProduct(bread);
        store.addProduct(milk);

        System.out.println("Продукты в магазине:");
        for (Product product : store.getProducts()) {
            System.out.println(product);
        }

        store.removeProduct(bread);

        System.out.println("Продукты в магазине после удаления хлеба:");
        for (Product product : store.getProducts()) {
            System.out.println(product);
        }

        double totalPrice = store.getTotalPrice();
        System.out.println("Общая стоимость продуктов в магазине: $" + totalPrice);
    }
}
```

## Установка и запуск тестов
1. Клонируйте репозиторий.
2. Импортируйте проект в вашу среду разработки (например, IntelliJ IDEA 2024.2.2, Ultimate Edition).
3. Откройте и запустите автотесты в классе `StoreTest` для проверки функциональности.

## Лицензия
Этот проект находится под лицензией MIT. См. файл `LICENSE` для получения подробной информации.