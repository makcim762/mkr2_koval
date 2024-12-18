public class ArenaLogger implements ArenaObserver {
    @Override
    public void onCharacterAdded(Character character) {
        System.out.println("Observer: " + character.getName() + " was added to the arena at coordinates (" +
                character.getCoordinates()[0] + ", " + character.getCoordinates()[1] + ").");
    }
}
