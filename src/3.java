public class SportsStats {
  public static void main(String[] args) {
    System.out.println("Welcome to Sports Stats!");
    int player1Score = 5;
    int player2Score = 8;
    int winner = determineWinner(player1Score, player2Score);
    System.out.println("The winner is " + winner);
  }

  private static int determineWinner(int player1Score, int player2Score) {
    if (player1Score > player2Score) {
      return 1;
    } else if (player2Score > player1Score) {
      return 2;
    } else {
      return 0;
    }
  }
}
