public class Reader {
    public static void displayHealthAndFatigue(Object obj) {
        if (obj instanceof HasHealthPoint) {
            int health = ((HasHealthPoint) obj).getHealthPoints();
            String healthText = "Lives: " + health;
            System.out.println(getColoredText(healthText, health, 100));
        }
        if (obj instanceof Tiredness) {
            int fatigue = ((Tiredness) obj).getFatigueLevel();
            String fatigueText = "Fatigue: " + fatigue;
            System.out.println(getColoredText(fatigueText, fatigue, 100));
        }
    }

    private static String getColoredText(String text, int value, int max) {
        int percentage = (int) (100.0 * value / max);
        if (percentage < 25) {
            return "\u001B[31m" + text + "\u001B[0m"; // RED
        } else if (percentage < 51) {
            return "\u001B[33m" + text + "\u001B[0m"; // YELLOW
        } else {
            return "\u001B[32m" + text + "\u001B[0m"; // GREEN
        }
    }
}

public interface HasHealthPoint {
    int getHealthPoints();
}

public interface Tiredness {
    int getFatigueLevel();
}

