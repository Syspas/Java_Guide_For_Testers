package org.Step1JavaOOPBeginning.etc.JungleStory;

import java.util.Random;

/**
 * Класс, представляющий ящерицу.
 */
public class Lizard {
    private int size;
    private String species;
    private int population;// Популяция
    private int hungerLevel; // Уровень голода
    private String name;


    /**
     * Конструктор класса Lizard.
     *
     * @param size       Размер ящерицы в сантиметрах.
     * @param species    Вид ящерицы.
     * @param population Размер популяции ящериц.
     */
    public Lizard(int size, String species, int population) {
        this.size = size;
        this.species = species;
        this.population = population;
        this.hungerLevel = 5; // Начальный уровень голода
        this.name = "Геккон"; // Установим имя по умолчанию
    }

    // Геттер для имени ящерицы
    public String getName() {
        return name;
    }


    /**
     * Метод для контроля популяции насекомых.
     */
    public void controlInsectPopulation() {
        System.out.println("Ящерица " + species + " помогает контролировать популяцию насекомых.");
    }

    /**
     * Метод для опыления цветов.
     */
    public void pollinateFlowers() {
        System.out.println("Ящерица " + species + " опыляет цветы, перемещаясь по окрестностям.");
    }

    /**
     * Метод для распространения семян.
     */
    public void disperseSeed() {
        System.out.println("Ящерица " + species + " распространяет семена через свои экскременты.");
    }

    /**
     * Метод для индикации состояния окружающей среды.
     */
    public void indicateEnvironmentalHealth() {
        System.out.println("Присутствие ящериц " + species + " свидетельствует о здоровой окружающей среде.");
    }

    /**
     * Метод для поддержания баланса экосистемы.
     */
    public void maintainEcosystemBalance() {
        System.out.println("Ящерица " + species + " играет важную роль в поддержании баланса экосистемы.");
    }

    /**
     * Метод для привлечения туристов и исследователей.
     */
    public void provideEcotourismValue() {
        System.out.println("Ящерица " + species + " привлекает людей для экотуризма и научных исследований.");
    }

    /**
     * Метод для отображения информации о ящерице.
     */
    public void displayInfo() {
        System.out.println("Вид: " + species);
        System.out.println("Размер: " + size + " см");
        System.out.println("Популяция: " + population);
    }




    /**
     * Метод для охоты на насекомых.
     *
     * @param insect Насекомое, на которое охотится ящерица.
     * @return true, если охота была успешной, false - в противном случае.
     */
    public boolean hunt(Insect insect) {
        if (insect.isPoisonous()) {
            System.out.println("Ящерица " + species + " не хочет есть ядовитое насекомое " + insect.getName());
            return false;
        }

        Random random = new Random();
        int successChance = random.nextInt(100);
        if (successChance < 70) {
            System.out.println("Ящерица " + species + " успешно охотится на " + insect.getName() + "!");
            this.decreaseHunger(2); // Уменьшаем голод ящерицы
            return true;
        } else {
            System.out.println("Ящерица " + species + " не смогла поймать " + insect.getName() + ".");
            this.increaseHunger(1); // Увеличиваем голод ящерицы
            return false;
        }
    }



    /**
     * Увеличивает уровень голода ящерицы.
     *
     * @param amount Количество, на которое увеличивается голод.
     */
    public void increaseHunger(int amount) {
        hungerLevel += amount;
    }

    /**
     * Уменьшает уровень голода ящерицы.
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
     * Возвращает уровень голода ящерицы.
     *
     * @return Уровень голода ящерицы.
     */
    public int getHungerLevel() {
        return hungerLevel;
    }

    /**
     * Метод для маскировки ящерицы.
     *
     * @return true, если маскировка была успешной, false - в противном случае.
     */
    public boolean camouflage() {
        Random random = new Random();
        int successChance = random.nextInt(100);
        if (successChance < 80) { // 80% шанс успеха
            System.out.println("Ящерица " + species + " успешно замаскировалась.");
            return true;
        } else {
            System.out.println("Ящерица " + species + " не смогла замаскироваться.");
            return false;
        }
    }


    /**
     * Метод, определяющий, сможет ли ящерица охотиться на млекопитающее.
     *
     * @param mammal Млекопитающее, на которое охотится ящерица.
     * @return true, если ящерица успешно охотится на млекопитающее,
     *         false в противном случае.
     */
    public boolean hunt(Mammal mammal) {
        if (mammal instanceof Mouse) { // Проверяем, мышь ли это
            Random random = new Random();
            int successChance = random.nextInt(100);
            if (successChance < 70) {
                System.out.println("Ящерица " + species + " успешно охотится на " + mammal.getName() + "!");
                this.decreaseHunger(3); // Уменьшаем голод ящерицы
                return true;
            } else {
                System.out.println("Ящерица " + species + " не смогла поймать " + mammal.getName() + ".");
                this.increaseHunger(1); // Увеличиваем голод ящерицы
                return false;
            }
        } else if (mammal instanceof Elephant) { // Проверяем, слон ли это
            if (1 < mammal.getSize()) { // Если ящерица меньше слона
                System.out.println("Ящерица " + species + " испугалась слона и убежала!");
                return false; // Ящерица не охотится на слона
            } else {
                System.out.println("Ящерица " + species + " слишком большая и не боится слона.");
                // Тут можно добавить логику для охоты на слона, если хотите
                return false;
            }
        } else {
            System.out.println("Ящерица " + species + " не может охотиться на это животное.");
            return false;
        }
    }


}
