# Проект "Животное"

Этот проект демонстрирует концепцию наследования и полиморфизма в Java с использованием базового класса `Animal.org.Step2JavaOOPBeginning.Animal` и его подклассов `Dog` и `org.Step1JavaOOPBeginning.HomeWork.Task1.Cat`.

## Описание классов

### Класс `Animal.org.Step2JavaOOPBeginning.Animal`

Базовый класс, представляющий животное.

**Поля:**
- `name` (String): Имя животного.
- `age` (int): Возраст животного.
- `species` (String): Вид животного.

**Методы:**
- `makeSound()`: Издать звук.
- `move()`: Двигаться.

### Класс `Dog`

Подкласс, представляющий собаку.

**Коструктор:**
- `Dog(String name, int age)`: Создает объект типа `Dog` с указанными именем и возрастом.

**Переопределенные методы:**
- `makeSound()`: Лает ("Гав-гав!").
- `move()`: Бежит.

### Класс `org.Step1JavaOOPBeginning.HomeWork.Task1.Cat`

Подкласс, представляющий кошку.

**Коструктор:**
- `org.Step1JavaOOPBeginning.HomeWork.Task1.Cat(String name, int age)`: Создает объект типа `org.Step1JavaOOPBeginning.HomeWork.Task1.Cat` с указанными именем и возрастом.

**Переопределенные методы:**
- `makeSound()`: Мяукает ("Мяу!").
- `move()`: Идет.

## Пример использования

Пример использования классов представлен в классе `Main`.

```java
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", 5);
        org.Step1JavaOOPBeginning.HomeWork.Task1.Cat cat = new org.Step1JavaOOPBeginning.HomeWork.Task1.Cat("Мурка", 3);

        dog.makeSound();
        dog.move();

        cat.makeSound();
        cat.move();
    }
}
```

В этом примере создаются объекты классов `Dog` и `org.Step1JavaOOPBeginning.HomeWork.Task1.Cat`, а затем вызываются их методы `makeSound()` и `move()`.

## Генерация Javadoc

Классы в этом проекте имеют комментарии Javadoc. Чтобы сгенерировать HTML-документацию на основе этих комментариев, выполните следующие шаги:

1. Убедитесь, что вы находитесь в директории с исходным кодом.
2. Выполните следующую команду, чтобы сгенерировать Javadoc:

```sh
javadoc -d doc *.java
```

3. В результате будет создана директория `doc`, содержащая HTML файлы с документацией. Откройте файл `index.html` в браузере, чтобы просмотреть сгенерированную документацию.

## Запуск проекта

Для запуска проекта выполните следующие шаги:

1. Скомпилируйте все файлы:
   ```sh
   javac Main.java Animal.org.Step2JavaOOPBeginning.Animal.java Dog.java org.Step1JavaOOPBeginning.HomeWork.Task1.Cat.java
   ```

2. Запустите класс `Main`:
   ```sh
   java Main
   ```

## Лицензия

Этот проект лицензирован под лицензией MIT.