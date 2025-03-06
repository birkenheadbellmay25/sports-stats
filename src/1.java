import java.util.*;

public class SportsStats {
    public static void main(String[] args) {
        // Initialize variables
        int player1Score = 0;
        int player2Score = 0;

        // Get input from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of points scored by Player 1: ");
        player1Score = scan.nextInt();
        System.out.print("Enter the number of points scored by Player 2: ");
        player2Score = scan.nextInt();

        // Calculate the total number of points scored
        int totalPoints = player1Score + player2Score;

        // Print the result
        System.out.println("Total Points Scored: " + totalPoints);
    }
}
