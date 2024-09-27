package org.Step2JavaOOPBeginning.Animal;

/**
 * Класс, представляющий животное.
 */
public class Animal {
    private String name;
    private int age;

    /**
     * Конструктор, инициализирующий свойства животного.
     *
     * @param name имя животного
     * @param age возраст животного
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод для издания звука животным.
     */
    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    /**
     * Метод для перемещения животного.
     */
    public void move() {
        System.out.println("Животное двигается");
    }
}
