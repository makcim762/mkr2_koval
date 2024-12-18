public class Mage implements Character {
    private final String name;
    private final int health;
    private final int attack;
    private final int[] coordinates;

    public Mage(String name, int x, int y) {
        this.name = name;
        this.health = 100;
        this.attack = 40;
        this.coordinates = new int[] {x, y};
    }

    @Override
    public void displayStats() {
        System.out.println(name + " (Mage): Health = " + health + ", Attack = " + attack +
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
