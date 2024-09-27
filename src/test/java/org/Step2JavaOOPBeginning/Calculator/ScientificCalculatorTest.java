package org.Step2JavaOOPBeginning.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Тестовый класс для проверки методов класса ScientificCalculator.
 */
public class ScientificCalculatorTest {

    /**
     * Тестирует метод сложения.
     * Проверяет различные варианты сложения двух чисел.
     */
    @Test
    public void testAdd() {
        ScientificCalculator calculator = new ScientificCalculator();
        assertEquals(3, calculator.add(1, 2));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-2, calculator.add(-1, -1));
        assertEquals(0, calculator.add(0, 0));
    }

    /**
     * Тестирует метод вычитания.
     * Проверяет различные варианты вычитания двух чисел.
     */
    @Test
    public void testSubtract() {
        ScientificCalculator calculator = new ScientificCalculator();
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-2, calculator.subtract(3, 5));
        assertEquals(0, calculator.subtract(5, 5));
    }

    /**
     * Тестирует метод умножения.
     * Проверяет различные варианты умножения двух чисел.
     */
    @Test
    public void testMultiply() {
        ScientificCalculator calculator = new ScientificCalculator();
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(-15, calculator.multiply(5, -3));
        assertEquals(0, calculator.multiply(5, 0));
    }

    /**
     * Тестирует метод деления.
     * Проверяет деление двух чисел и выброс исключения при делении на ноль.
     */
    @Test
    public void testDivide() {
        ScientificCalculator calculator = new ScientificCalculator();
        assertEquals(2.5, calculator.divide(5, 2), 0.001);

        // Проверка деления на ноль
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
    }
}

