import java.util.Random;

public class SportsStats {
    public static void main(String[] args) {
        Random random = new Random();
        int team1Score = random.nextInt(10);
        int team2Score = random.nextInt(10);
        if (team1Score > team2Score) {
            System.out.println("Team 1 wins");
        } else if (team1Score < team2Score) {
            System.out.println("Team 2 wins");
        } else {
            System.out.println("It's a tie");
        }
    }
}
