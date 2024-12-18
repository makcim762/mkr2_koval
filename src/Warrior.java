public class Warrior implements Character {
    private final String name; // Ім'я персонажа
    private final int health;
    private final int attack;
    private final int[] coordinates; // Координати персонажа

    public Warrior(String name, int x, int y) {
        this.name = name;
        this.health = 150;
        this.attack = 20;
        this.coordinates = new int[] {x, y};
    }

    @Override
    public void displayStats() {
        System.out.println(name + " (Warrior): Health = " + health + ", Attack = " + attack +
                ", Coordinates = (" + coordinates[0] + ", " + coordinates[1] + ")");
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int[] getCoordinates() {
        return coordinates;
    }
}
