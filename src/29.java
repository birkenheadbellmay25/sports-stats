import java.util.Arrays;

public class SportsStats {

    public static void main(String[] args) {
        // Example usage
        System.out.println("Number of goals: " + getGoals());

        // Another example usage
        String[] players = {"Player1", "Player2", "Player3"};
        System.out.println("Players: " + Arrays.toString(players));
    }

    private static int getGoals() {
        return 78;
    }
}
