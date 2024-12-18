package mediator;

import factory.Character;

public interface Mediator {
    void addCharacter(Character character);
    void coordinateActions();
    // Можливо, методи для ініціації атак, переміщень тощо
}
