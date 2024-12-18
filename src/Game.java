import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Arena arena = new Arena();
        ArenaLogger logger = new ArenaLogger();
        arena.registerObserver(logger);

        // Отримання вибору персонажа від гравця
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть тип персонажа (Warrior, Mage, Archer): ");
        String characterType = scanner.nextLine();

        // Отримання імені персонажа від гравця
        System.out.println("Введіть ім'я персонажа: ");
        String characterName = scanner.nextLine();

        // Введення координат для персонажа
        System.out.println("Введіть координати персонажа (x y): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Створення персонажа через фабрику
        Character character = CharacterFactory.createCharacter(characterType, characterName, x, y);

        // Додавання персонажа на арену
        arena.addCharacter(character);

        // Виведення статистики персонажа
        character.displayStats();
    }
}
