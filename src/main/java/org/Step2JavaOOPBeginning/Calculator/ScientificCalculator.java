package org.Step2JavaOOPBeginning.Calculator;

// Расширенный класс ScientificCalculator, наследующий Calculator
public class ScientificCalculator extends Calculator {

    // Метод для вычитания
    public int subtract(int a, int b) {
        return a - b;
    }

    // Метод для умножения
    public int multiply(int a, int b) {
        return a * b;
    }

    // Метод для деления
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
        return (double) a / b;
    }
}