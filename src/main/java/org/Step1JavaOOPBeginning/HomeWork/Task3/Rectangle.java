package org.Step1JavaOOPBeginning.HomeWork.Task3;

public class Rectangle {
    private double length;
    private double width;

    /**
     * Конструктор с параметрами.
     * 
     * @param length длина прямоугольника
     * @param width ширина прямоугольника
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Метод для вычисления площади.
     * 
     * @return площадь прямоугольника
     */
    public double calculateArea() {
        return length * width;
    }

    /**
     * Метод для вычисления периметра.
     * 
     * @return периметр прямоугольника
     */
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}