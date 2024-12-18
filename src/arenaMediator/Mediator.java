package arenaMediator;

import characterFactory.Character;

public interface Mediator {
    void addCharacter(Character character);
    void coordinateActions();
}
