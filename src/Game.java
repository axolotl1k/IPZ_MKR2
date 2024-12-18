import characterFactory.*;
import characterFactory.Character;
import arenaMediator.Arena;
import observers.VisionRangeNotifier;

public class Game {
    public static void main(String[] args) {
        Arena arena = new Arena();

        VisionRangeNotifier notifier = new VisionRangeNotifier();
        arena.addObserver(notifier);

        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        Character warrior = warriorFactory.createCharacter("Warrior", 10, 10);
        Character mage = mageFactory.createCharacter("Mage", 15, 15);
        Character archer = archerFactory.createCharacter("Archer", 20, 20);

        arena.addCharacter(warrior);
        arena.addCharacter(mage);
        arena.addCharacter(archer);

        arena.coordinateActions();
    }
}
