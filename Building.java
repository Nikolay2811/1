public class Building implements HasHealthPoint {
    private int healthPoints;

    public Building(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }
}