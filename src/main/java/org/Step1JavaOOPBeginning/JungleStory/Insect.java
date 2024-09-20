package org.Step1JavaOOPBeginning.JungleStory;

import java.util.Random;

/**
 * Класс, представляющий насекомое, которым питается ящерица.
 */
public class Insect {
    private String name;
    private int size;
    private boolean isPoisonous; // Ядовито ли насекомое

    /**
     * Конструктор класса Insect.
     *
     * @param name         Название насекомого.
     * @param size         Размер насекомого.
     * @param isPoisonous Ядовито ли насекомое.
     */
    public Insect(String name, int size, boolean isPoisonous) {
        this.name = name;
        this.size = size;
        this.isPoisonous = isPoisonous;
    }

    /**
     * Возвращает название насекомого.
     *
     * @return Название насекомого.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает размер насекомого.
     *
     * @return Размер насекомого.
     */
    public int getSize() {
        return size;
    }

    /**
     * Возвращает, ядовито ли насекомое.
     *
     * @return true, если ядовито, false - в противном случае.
     */
    public boolean isPoisonous() {
        return isPoisonous;
    }

    /**
     * Метод, имитирующий движение насекомого.
     */
    public void move() {
        Random random = new Random();
        int direction = random.nextInt(4);
        switch (direction) {
            case 0:
                System.out.println(name + " движется вверх.");
                break;
            case 1:
                System.out.println(name + " движется вниз.");
                break;
            case 2:
                System.out.println(name + " движется влево.");
                break;
            case 3:
                System.out.println(name + " движется вправо.");
                break;
        }



    }


}
