package mediator;

import factory.Character;
import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Arena implements Mediator, Observable {
    private List<Character> characters = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addCharacter(Character character) {
        characters.add(character);
        notifyObservers(character);
    }

    @Override
    public void coordinateActions() {
        // Простий приклад: перший атакує другого, якщо є принаймні два персонажі
        if (characters.size() > 1) {
            Character c1 = characters.get(0);
            Character c2 = characters.get(1);
            c1.attack(c2);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Object obj) {
        for (Observer obs : observers) {
            obs.update(this, obj);
        }
    }

    public List<Character> getCharacters() {
        return characters;
    }
}
