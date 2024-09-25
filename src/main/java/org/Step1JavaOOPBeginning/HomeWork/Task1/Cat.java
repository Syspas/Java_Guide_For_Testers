package org.Step1JavaOOPBeginning.HomeWork.Task1;

/**
 * Подкласс Cat, представляющий кошку.
 */
class Cat extends Animal {

    /**
     * Конструктор для создания объекта Cat.
     *
     * @param name Имя кошки.
     * @param age  Возраст кошки.
     */
    public Cat(String name, int age) {
        super(name, age, "Cat");
    }

    /**
     * Метод, который заставляет кошку мяукать.
     */
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает: Мяу!");
    }

    /**
     * Метод, который заставляет кошку идти.
     */
    @Override
    public void move() {
        System.out.println("Кошка идет");
    }
}