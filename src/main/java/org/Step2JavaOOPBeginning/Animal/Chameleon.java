package org.Step2JavaOOPBeginning.Animal;
/**
 * Класс, представляющий хамелеона, который наследует класс Step2JavaOOPBeginning.Animal.Animal.
 */
public class Chameleon extends Animal {
    private String color;

    /**
     * Конструктор, инициализирующий свойства хамелеона.
     *
     * @param name имя хамелеона
     * @param age возраст хамелеона
     * @param color цвет хамелеона
     */
    public Chameleon(String name, int age, String color) {
        super(name, age); // Вызов конструктора родительского класса
        this.color = color;
    }

    /**
     * Метод для изменения цвета хамелеона.
     */
    public void camouflage() {
        System.out.println("Хамелеон меняет цвет!");
    }
}