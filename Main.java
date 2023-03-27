
public class Main {
    public static void main(String[] args) {
        Building building = new Building(80);
        Character character = new Character(60, 40);

        Reader.displayHealthAndFatigue(building);
        Reader.displayHealthAndFatigue(character);
    }
}
