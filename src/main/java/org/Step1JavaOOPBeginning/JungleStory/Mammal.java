package org.Step1JavaOOPBeginning.JungleStory;

import java.util.Random;

/**
 * Класс, представляющий млекопитающее.
 */
public class Mammal {
    private String name;
    private int size; // Размер млекопитающего
    private int hungerLevel; // Уровень голода

    /**
     * Конструктор класса Mammal.
     *
     * @param name        Имя млекопитающего.
     * @param size        Размер млекопитающего.
     */
    public Mammal(String name, int size) {
        this.name = name;
        this.size = size;
        this.hungerLevel = 5; // Начальный уровень голода
    }

    /**
     * Возвращает имя млекопитающего.
     *
     * @return Имя млекопитающего.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает размер млекопитающего.
     *
     * @return Размер млекопитающего.
     */
    public int getSize() {
        return size;
    }

    /**
     * Увеличивает уровень голода млекопитающего.
     *
     * @param amount Количество, на которое увеличивается голод.
     */
    public void increaseHunger(int amount) {
        hungerLevel += amount;
    }

    /**
     * Уменьшает уровень голода млекопитающего.
     *
     * @param amount Количество, на которое уменьшается голод.
     */
    public void decreaseHunger(int amount) {
        hungerLevel -= amount;
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
    }

    /**
     * Возвращает уровень голода млекопитающего.
     *
     * @return Уровень голода млекопитающего.
     */
    public int getHungerLevel() {
        return hungerLevel;
    }

    /**
     * Метод, имитирующий движение млекопитающего.
     */
    public void move() {
        Random random = new Random();
        int direction = random.nextInt(4);
        switch (direction) {
            case 0:
                System.out.println(name + " бежит вперед.");
                break;
            case 1:
                System.out.println(name + " бежит назад.");
                break;
            case 2:
                System.out.println(name + " бежит влево.");
                break;
            case 3:
                System.out.println(name + " бежит вправо.");
                break;
        }
    }
}



