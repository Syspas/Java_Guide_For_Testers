package org.Step1JavaOOPBeginning.etc.JungleStory;
public class Main {
    public static void main(String[] args) {


        JungleCreationStory jungleStory = new JungleCreationStory();
        jungleStory.printHistory();
        System.out.println();
        jungleStory.printRandomStory();

        // Создание объекта, представляющего 12 часов дня
        DayTime dayTime = new DayTime(12);
        System.out.println("Наступает новый " + dayTime.getTimeOfDay()); // Вывод: Сейчас в джунглях День
        System.out.println(dayTime.getStory()); // Вывод: одна из историй из массива MORNING_STORIES

        // Создание различных животных
        Lizard gecko = new Lizard(10, "Хамелеон", 100);
        Insect beetle = new Insect("Жука", 5, false);
        Insect scorpion = new Insect(". Фу какой противный жук", 7, true);
        Jungle jungle = new Jungle();

        // Получение рекомендации по охоте для геккона
        String recommendation = jungle.getHuntingRecommendation(gecko);
        System.out.println(recommendation);

        // Создание других животных
        Mouse mickey = new Mouse("Мыш Микки");
        Elephant dumbo = new Elephant("Дамбо", 5000);

        // Охота геккона на различных животных
        gecko.hunt(beetle); // Успешная охота
        gecko.hunt(scorpion); // Ящерица не ест
        gecko.hunt(mickey); // Охота на мышь
        gecko.hunt(dumbo); // Ящерица убегает от слона
        gecko.camouflage(); // Геккон маскируется

        GeckoStory geckoStory = new GeckoStory();//
        System.out.println(geckoStory.getStory());

        // Создание объекта, представляющего 10 часов ночи
        dayTime = new DayTime(22);
        System.out.println("В джунглях наступает  " + dayTime.getTimeOfDay()); // Вывод: Сейчас в джунглях Ночь
        System.out.println(dayTime.getStory()); // Вывод: одна из историй из массива NIGHT_STORIES
    }
}
