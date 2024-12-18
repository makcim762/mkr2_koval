public interface Character {
    void displayStats();
    int getHealth();
    int getAttack();
    String getName(); // Новий метод для отримання імені
    int[] getCoordinates(); // Метод для отримання координат персонажа
}
