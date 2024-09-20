package org.Step1JavaOOPBeginning.JungleStory;

import java.util.ArrayList;
import java.util.Random;

/**
 * Класс GeckoStory представляет собой коллекцию историй о геконах.
 */
public class GeckoStory {
    private ArrayList<String> stories; // Список историй
    private Random random; // Генератор случайных чисел

    /**
     * Конструктор класса GeckoStory.
     * Инициализирует список историй и объект генератора случайных чисел.
     */
    public GeckoStory() {
        stories = new ArrayList<>();
        addStories(); // Добавление историй в список
        random = new Random(); // Создание генератора случайных чисел
    }

    /**
     * Метод addStories добавляет предопределенные истории о геконах в список.
     */
    private void addStories() {
        stories.add("Гекон успешно поймал муху и заблудился в лесу.");
        stories.add("После охоты гекон нашел странный предмет на земле.");
        stories.add("Гекон испугался своего отражения в лужице и прыгнул в кусты.");
        stories.add("Он встретил другого гекона, и они стали друзьями.");
        stories.add("Гекон устроил конкурс на ловлю с другими геконами.");
        stories.add("После охоты он устроился на солнечном месте отдохнуть.");
        stories.add("Гекон наткнулся на паука и решил обойти его.");
        stories.add("Он заметил, что хвост стал длиннее после зимней спячки.");
        stories.add("Гекон заметил, что лес изменился после дождя.");
        stories.add("Он вернулся в свободу, проводя время на своем любимом месте.");
    }

    /**
     * Метод getStory возвращает случайную историю из списка.
     *
     * @return Случайная история о геконе.
     */
    public String getStory() {
        return stories.get(random.nextInt(stories.size())); // Возвращает случайную историю
    }

    // Пример использования
    public static void main(String[] args) {
        GeckoStory geckoStory = new GeckoStory();
        System.out.println(geckoStory.getStory()); // Вывод случайной истории
    }
}
