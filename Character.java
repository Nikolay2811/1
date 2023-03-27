public class Character implements HasHealthPoint, Tiredness {
    private int healthPoints;
    private int fatigueLevel;

    public Character(int healthPoints, int fatigueLevel) {
        this.healthPoints = healthPoints;
        this.fatigueLevel = fatigueLevel;
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public int getFatigueLevel() {
        return fatigueLevel;
    }
}
