package org.Step2JavaOOPBeginning.Calculator;

public class Main {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();

        System.out.println("Сложение: " + calc.add(5, 3));         // 8
        System.out.println("Вычитание: " + calc.subtract(5, 3)); // 2
        System.out.println("Умножение: " + calc.multiply(5, 3)); // 15
        System.out.println("Деление: " + calc.divide(5, 2));     // 2.5
    }
}
