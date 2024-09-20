package org.Step1JavaOOPBeginning.Lizard;


/**
 * Класс Chameleon представляет хамелеона,
 * описывая его свойства и действия.
 */
public class Сhameleon {
    /**
     * Имя хамелеона.
     */
    String name; //Имя хамелеона.

    /**
     * Цвет хамелеона.
     */
    String color; // Цвет хамелеона.

    /**
     * Скорость хамелеона.
     */
    int speed; // Скорость хамелеона.

    /**
     * Конструктор класса Chameleon.
     *
     * @param name  Имя хамелеона.
     * @param color Цвет хамелеона.
     * @param speed Скорость хамелеона.
     */
    public Сhameleon(String name, String color, int speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    /**
     * Метод, который позволяет хамелеону маскироваться
     * под цвет окружающей среды.
     */
    public void camouflage() {
        System.out.println(name + " маскируется под цвет окружающей среды!");
    }

    /**
     * Метод, который имитирует охоту хамелеона на насекомых.
     */
    public void hunt() {
        System.out.println(name + " охотится на насекомых!");
    }


}



