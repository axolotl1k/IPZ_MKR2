import characterFactory.*;
import characterFactory.Character;
import arenaMediator.Arena;
import observers.VisionRangeNotifier;

public class Main {
    public static void main(String[] args) {
        // Створюємо арену (Медіатор)
        Arena arena = new Arena();

        // Додаємо спостерігача (Спостерігач)
        VisionRangeNotifier notifier = new VisionRangeNotifier();
        arena.addObserver(notifier);

        // Фабричний метод для створення різних типів персонажів
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        // Створюємо персонажів
        Character warrior = warriorFactory.createCharacter("Warrior", 10, 10);
        Character mage = mageFactory.createCharacter("Mage", 15, 15);
        Character archer = archerFactory.createCharacter("Archer", 20, 20);

        // Додаємо персонажів на арену
        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        // Координуємо їхні дії (наприклад, перший атакує другого)
        arena.coordinateActions();
    }
}
