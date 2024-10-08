package org.Step1JavaOOPBeginning.etc.JungleStory;

import java.util.Random;

/**
 * Класс, представляющий время суток в джунглях.
 */
public class DayTime {
    private int hour;
    private String timeOfDay;
    private String story;

    private static final String[] MORNING_STORIES = {
            "Солнце только что взошло над джунглями, и его первые лучи освещают путь путешественникам. Обезьяны уже активно перепрыгивают с дерева на дерево, а птицы радостно приветствуют новый день своими трелями.",
            "Утренняя свежесть наполняет воздух джунглей. Путешественники бодро выходят в путь, предвкушая интересные открытия, которые ждут их впереди.",
            "Первые лучи солнца пробиваются сквозь густую листву, освещая тропинки в джунглях. Звуки просыпающейся природы наполняют воздух, настраивая на позитивный лад."
    };

    private static final String[] NIGHT_STORIES = {
            "Темнота окутывает джунгли, и только свет луны пробивается сквозь густую листву. Хищники выходят на охоту, их глаза блестят в ночной тьме. Путешественники осторожно продвигаются вперед, стараясь не привлекать внимание опасных зверей.",
            "Ночная тишина нарушается лишь редкими звуками ночных животных. Путешественники напряженно вглядываются в темноту, готовые в любой момент отразить нападение хищников.",
            "Джунгли погружаются во мрак, и только луна освещает тропинки. Путешественники слышат вдалеке рычание диких зверей, заставляющее их сердца биться быстрее."
    };

    /**
     * Конструктор класса DayTime.
     * @param hour текущий час в джунглях
     */
    public DayTime(int hour) {
        this.hour = hour;
        setTimeOfDay();
        setStory();
    }

    /**
     * Метод, устанавливающий время суток в джунглях.
     */
    private void setTimeOfDay() {
        if (hour >= 6 && hour < 18) {
            timeOfDay = "День";
        } else {
            timeOfDay = "Ночь";
        }
    }

    /**
     * Метод, устанавливающий историю в зависимости от времени суток.
     */
    private void setStory() {
        Random random = new Random();
        if (timeOfDay.equals("День")) {
            story = MORNING_STORIES[random.nextInt(MORNING_STORIES.length)];
        } else {
            story = NIGHT_STORIES[random.nextInt(NIGHT_STORIES.length)];
        }
    }

    /**
     * Метод, возвращающий текущее время суток в джунглях.
     * @return время суток в джунглях
     */
    public String getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * Метод, возвращающий текущий час в джунглях.
     * @return текущий час в джунглях
     */
    public int getHour() {
        return hour;
    }

    /**
     * Метод, возвращающий историю, связанную с текущим временем суток.
     * @return история о времени суток в джунглях
     */
    public String getStory() {
        return story;
    }
}
