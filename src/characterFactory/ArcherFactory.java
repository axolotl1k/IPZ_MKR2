package characterFactory;

public class ArcherFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name, int x, int y) {
        // Лучник: здоров’я 120, атака 30
        return new Archer(name, 120, 30, x, y);
    }

    private class Archer extends Character {
        public Archer(String name, int health, int attackPower, int x, int y) {
            super(name, health, attackPower, x, y);
        }
    }
}
