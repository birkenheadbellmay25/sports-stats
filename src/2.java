import java.util.*;

public class SportsStats {
    public static void main(String[] args) {
        // Declare variables
        int player1Score = 0;
        int player2Score = 0;

        // Initialize a new instance of the Scanner class to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of games played
        System.out.print("Enter the number of games played: ");
        int numGames = scanner.nextInt();

        // Loop through each game and update the player scores
        for (int i = 0; i < numGames; i++) {
            System.out.print("Enter the score for player 1: ");
            int player1Score = scanner.nextInt();

            System.out.print("Enter the score for player 2: ");
            int player2Score = scanner.nextInt();
        }

        // Calculate the total number of points scored by both players
        int totalPoints = player1Score + player2Score;

        // Print the total number of points scored by both players
        System.out.println("Total points: " + totalPoints);
    }
}
