package org.Step1JavaOOPBeginning.etc.JungleStory;
import java.util.Random;

public class JungleCreationStory {

    private String history;
    private String randomStory;

    private String[] stories = {
            "Много миллионов лет назад, когда Земля лишь начинала обретать свои контуры, природа сплела уникальную симфонию, "
                    + "которая положила начало джунглям. С солнечными лучами жизнь растений начала расцветать, а мощные дожди полили новые земли.",

            "Когда климат охлаждался, на поверхности стали появляться первые горы и острова. Природа устроила симфонию, "
                    + "в результате чего реки образовали влажные тропики, где растения дружно укрывали свои корни в богатой почве.",

            "Джунгли стали символом взаимодействия природы и животных. Птицы, млекопитающие и ящерицы искали укрытие в густых зарослях, "
                    + "создавая удивительную экосистему, где каждый элемент играл свою роль.",

            "С приходом дождей, жизнь в джунглях заполнилась многообразием. Особенно активными были насекомые, "
                    + "которые обеспечивали опыление растений и превращали джунгли в оазис жизни.",

            "По мере роста деревьев, их ветви соединялись, создавая зеленый потолок, под которым происходили удивительные истории, "
                    + "включая встречи диких животных и растения, взаимодействующие друг с другом.",

            "В период процветания, джунгли стали местом для изучения редких трав и удивительных созданий, "
                    + "каждый из которых скрывал свои секреты и загадки, ожидая, когда их откроют исследователи."
    };

    public JungleCreationStory() {
        this.history = createHistory();
        this.randomStory = generateRandomStory();
    }

    private String createHistory() {
        return history;
    }

    private String generateRandomStory() {
        Random rand = new Random();
        return stories[rand.nextInt(stories.length)];
    }

    public void printHistory() {
        System.out.println(history);
    }

    public void printRandomStory() {
        System.out.println("Случайная история: " + randomStory);
    }

    public static void main(String[] args) {
        JungleCreationStory jungleStory = new JungleCreationStory();
        jungleStory.printHistory();
        System.out.println();
        jungleStory.printRandomStory();
    }
}
