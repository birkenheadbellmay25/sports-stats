import java.util.Random;

public class SportsStats {
    public static void main(String[] args) {
        Random rand = new Random();
        int team1Score = rand.nextInt(10);
        int team2Score = rand.nextInt(10);
        System.out.println("Team 1 score: " + team1Score);
        System.out.println("Team 2 score: " + team2Score);
    }
}
