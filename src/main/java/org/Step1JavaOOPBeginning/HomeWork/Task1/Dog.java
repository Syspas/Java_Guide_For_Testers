package org.Step1JavaOOPBeginning.HomeWork.Task1;
/**
 * Подкласс Dog, представляющий собаку.
 */
class Dog extends Animal {

    /**
     * Конструктор для создания объекта Dog.
     *
     * @param name Имя собаки.
     * @param age  Возраст собаки.
     */
    public Dog(String name, int age) {
        super(name, age, "Dog");
    }

    /**
     * Метод, который заставляет собаку лаять.
     */
    @Override
    public void makeSound() {
        System.out.println("Собака лает: Гав-гав!");
    }

    /**
     * Метод, который заставляет собаку бежать.
     */
    @Override
    public void move() {
        System.out.println("Собака бежит");
    }
}