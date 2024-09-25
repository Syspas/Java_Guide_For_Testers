package org.Step1JavaOOPBeginning.HomeWork.Task3;

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