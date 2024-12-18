import java.util.List;
import java.util.ArrayList;

public class Arena {
    private final List<ArenaObserver> observers = new ArrayList<>();
    private final List<Character> characters = new ArrayList<>(); // Додаємо список персонажів на арені

    /**
     * Додає персонажа на арену.
     *
     * @param character Персонаж, який додається на арену.
     */
    public void addCharacter(Character character) {
        characters.add(character); // Додаємо персонажа в список
        System.out.println(character.getName() + " has entered the arena at coordinates (" +
                character.getCoordinates()[0] + ", " + character.getCoordinates()[1] + ").");
        notifyObservers(character); // Передаємо об'єкт персонажа в сповіщення
    }

    /**
     * Реєструє спостерігача для відстеження подій на арені.
     *
     * @param observer Об'єкт спостерігача.
     */
    public void registerObserver(ArenaObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(Character character) {
        for (ArenaObserver observer : observers) {
            observer.onCharacterAdded(character); // Передаємо весь об'єкт персонажа
        }
    }
}
