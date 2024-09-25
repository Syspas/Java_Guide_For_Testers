package org.Step1JavaOOPBeginning.etc.JungleStory;

/**
 * Класс, представляющий слона.
 *
 * При создании и вызове объекта этого класса
 * в консоль выводится сообщение о том, что
 * джунгли затряслись от топающего слона.
 */
public class Elephant extends Mammal {

    /**
     * Конструктор класса Elephant.
     *
     *
     */
    public Elephant(String name, int size) {
        super(name, 5000000);  // Вызов конструктора родительского класса

    }

    /**
     * Метод, выводящий сообщение о появлении слона.
     */
    public void appearElephant() {
        System.out.println("Джунгли затряслись, огромный топот раздался по округе, " +
                "ломая деревья на поляну вышел слон.");
    }
}
