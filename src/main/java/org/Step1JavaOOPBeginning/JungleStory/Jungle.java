package org.Step1JavaOOPBeginning.JungleStory;

import java.util.Random;

public class Jungle {

    private String weather;

    /**
     * Метод для генерации случайной погоды в джунглях.
     */
    public void generateWeather() {
        Random random = new Random();
        int weatherCode = random.nextInt(3);
        switch (weatherCode) {
            case 0:
                weather = "Солнечно и жарко. Все животные ищут тень.";
                break;
            case 1:
                weather = "Дождливая погода. Животные прячутся от ливня.";
                break;
            case 2:
                weather = "Влажно и душно. Многие животные прячутся в укрытиях.";
                break;
        }
    }

    /**
     * Метод для получения описания текущей погоды в джунглях.
     *
     * @return Описание погоды в джунглях.
     */
    public String getWeatherDescription() {
        return weather;
    }



    public String getHuntingRecommendation(Lizard lizard) {
        generateWeather();
        String recommendation;
        if (weather.equals("Солнечно и жарко. Все животные ищут тень.")) {
            recommendation = "Солнце палит, и животные ищут прохладу. " +
                    lizard.getName() + ", тебе будет сложно найти добычу. " +
                    "Подожди, пока жара спадет, или попробуй охотиться на насекомых.";
        } else if (weather.equals("Дождливая погода. Животные прячутся от ливня.")) {
            recommendation = "Сильный дождь проливается над джунглями. " +
                    lizard.getName() + ", тебе будет сложно охотиться, так как " +
                    "все прячутся от ливня. Подожди, пока дождь стихнет.";
        } else {
            recommendation = "В джунглях стоит духота, животные прячутся в укрытиях. " +
                    lizard.getName() + ", тебе будет сложно найти добычу. " +
                    "Попробуй поискать пищу вблизи воды или в укрытиях.";
        }
        return recommendation;
    }
}
