public class Archer implements Character {
    private final String name;
    private final int health;
    private final int attack;
    private final int[] coordinates;

    public Archer(String name, int x, int y) {
        this.name = name;
        this.health = 120;
        this.attack = 30;
        this.coordinates = new int[] {x, y};
    }

    @Override
    public void displayStats() {
        System.out.println(name + " (Archer): Health = " + health + ", Attack = " + attack +
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
