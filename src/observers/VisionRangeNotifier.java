package observer;

import factory.Character;
import mediator.Arena;

public class VisionRangeNotifier implements Observer {
    private int visionRadius = 50;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Arena && arg instanceof Character) {
            Character newChar = (Character) arg;
            System.out.println("[Observer] New character added: " + newChar.getName());
        }
    }
}
