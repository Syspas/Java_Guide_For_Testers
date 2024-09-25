package org.Step1JavaOOPBeginning.Lizard;

/**
 * Класс org.Step1JavaOOPBeginning.HomeWork.Task1.Main, содержащий точку входа в программу.
 * В нем создается объект хамелеона и демонстрируется
 * использование его методов.
 */
public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Создание объекта хамелеона
        Сhameleon chameleon = new Сhameleon("Хамелион", "зеленый", 10);

        // Вызов метода маскировки
        chameleon.camouflage();

        // Вызов метода охоты
        chameleon.hunt();

        // Создание второго объекта хамелеона
        Сhameleon chameleon2 = new Сhameleon("Хамелион2", "Серый", 30);

        // Вызов метода охоты для второго хамелеона
        chameleon2.hunt();
    }
}