package org.Step1JavaOOPBeginning.HomeWork.Task1;
/**
 * Базовый класс Step2JavaOOPBeginning.Animal.Animal, представляющий животное.
 */
public class Animal {
    protected String name;
    protected int age;
    protected String species;

    /**
     * Конструктор для создания объекта Step2JavaOOPBeginning.Animal.Animal.
     *
     * @param name Имя животного.
     * @param age Возраст животного.
     * @param species Вид животного.
     */
    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    /**
     * Метод, который издает звук.
     */
    public void makeSound() {
        System.out.println("Это животное издает звук");
    }

    /**
     * Метод, который заставляет животное двигаться.
     */
    public void move() {
        System.out.println("Это животное движется");
    }
}

