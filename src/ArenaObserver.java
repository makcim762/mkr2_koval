public interface ArenaObserver {
    /**
     * Викликається, коли на арену додається новий персонаж.
     *
     * @param character Персонаж, який додається на арену.
     */
    void onCharacterAdded(Character character);
}
