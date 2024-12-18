package characterFactory;

public class MageFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name, int x, int y) {
        // Маг: здоров’я 100, атака 40
        return new Mage(name, 100, 40, x, y);
    }

    private class Mage extends Character {
        public Mage(String name, int health, int attackPower, int x, int y) {
            super(name, health, attackPower, x, y);
        }
    }
}
