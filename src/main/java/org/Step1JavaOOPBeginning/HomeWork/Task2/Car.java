package org.Step1JavaOOPBeginning.HomeWork.Task2;

/**
 * Класс представляет собой модель автомобиля с основными характеристиками и методами управления.
 */
public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;

    /**
     * Конструктор для создания экземпляра автомобиля.
     *
     * @param brand Марка автомобиля.
     * @param model Модель автомобиля.
     * @param year  Год выпуска автомобиля.
     * @param color Цвет автомобиля.
     */
    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    /**
     * Метод запускает двигатель автомобиля.
     */
    public void startEngine() {
        System.out.println("Двигатель " + brand + " " + model + " заведен.");
    }

    /**
     * Метод ускоряет автомобиль.
     */
    public void accelerate() {
        System.out.println(brand + " " + model + " набирает скорость.");
    }

    /**
     * Метод тормозит автомобиль.
     */
    public void brake() {
        System.out.println(brand + " " + model + " тормозит.");
    }
}