package characterFactory;

public class WarriorFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name, int x, int y) {
        // Воїн: здоров’я 150, атака 20
        return new Warrior(name, 150, 20, x, y);
    }

    private class Warrior extends Character {
        public Warrior(String name, int health, int attackPower, int x, int y) {
            super(name, health, attackPower, x, y);
        }
    }
}
