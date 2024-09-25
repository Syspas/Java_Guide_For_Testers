package org.Step1JavaOOPBeginning.HomeWork.Task1;

public class Main {
    /**
     * Главный метод для запуска примера.
     *
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 5);
        Cat cat = new Cat("Мурка", 3);
        dog.makeSound();
        dog.move();
        cat.makeSound();
        cat.move();
    }
}