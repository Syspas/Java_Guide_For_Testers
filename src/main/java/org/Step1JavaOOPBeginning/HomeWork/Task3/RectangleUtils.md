# Проект: Площадь и периметр прямоугольника

## Описание
Этот проект демонстрирует создание класса `Rectangle`, который позволяет вычислять площадь и периметр прямоугольника. Проект включает в себя основные методы для вычислений и юнит-тесты для проверки правильности их работы.

## Структура проекта
- `src/`
  - `main/`
    - `java/`
      - `org/`
        - `Step1JavaOOPBeginning/`
          - `HomeWork/`
            - `Task3/`
              - `Rectangle.java`
              - `Main.java`
  - `test/`
    - `java/`
      - `org/`
        - `Step1JavaOOPBeginning/`
          - `HomeWork/`
            - `Task3/`
              - `RectangleTest.java`

## Класс Rectangle
Класс `Rectangle` имеет следующие поля и методы:
- **Поля:**
  - `length` (double): длина прямоугольника.
  - `width` (double): ширина прямоугольника.

- **Методы:**
  - `Rectangle(double length, double width)`: конструктор для создания объекта прямоугольника с заданной длиной и шириной.
  - `double calculateArea()`: метод для вычисления площади прямоугольника.
  - `double calculatePerimeter()`: метод для вычисления периметра прямоугольника.

### Пример использования
```java
import org.Step1JavaOOPBeginning.HomeWork.Task3.Rectangle;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Rectangle
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Вычисление и вывод площади
        double area = rectangle.calculateArea();
        System.out.println("Площадь прямоугольника: " + area);

        // Вычисление и вывод периметра
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Периметр прямоугольника: " + perimeter);
    }
}
```

## Тесты
Юнит-тесты находятся в пакете `org.Step1JavaOOPBeginning.HomeWork.Task3` и включают тесты для проверки методов `calculateArea()` и `calculatePerimeter()`.

### Пример тестов (JUnit 5)
```java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testCalculateArea() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double expectedArea = 15.0;
        double actualArea = rectangle.calculateArea();
        assertEquals(expectedArea, actualArea, "Площадь рассчитана неверно");
    }

    @Test
    public void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        double expectedPerimeter = 16.0;
        double actualPerimeter = rectangle.calculatePerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, "Периметр рассчитан неверно");
    }
}
```

## Запуск проекта
Для запуска проекта выполните следующие шаги:
1. Клонируйте репозиторий на вашу локальную машину.
2. Откройте проект в вашей среде разработки (например, IntelliJ IDEA 2024.2.2, Ultimate Edition).
3. Запустите класс `Main` для выполнения вычислений.
4. Запустите тесты с помощью JUnit для проверки правильности работы методов.

## Лицензия
Этот проект находится под лицензией MIT. См. файл `LICENSE` для получения подробной информации.