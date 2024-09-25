package org.Step1JavaOOPBeginning.etc.JungleStory;

/**
 * Класс, представляющий мышь, которой питается ящерица.
 */
class Mouse extends Mammal {
    /**
     * Конструктор класса Mouse.
     *
     * @param name Имя мыши.
     */
    public Mouse(String name) {
        super(name, 5); // Размер мыши - 5 см
    }
}