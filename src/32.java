public class SportsStats {
    public static void main(String[] args) {
        // Add your sports data here
        // For example:
        int game1Wins = 5;
        int game2Losses = 3;

        if (game1Wins > game2Losses) {
            System.out.println("Game 1 won, Game 2 lost. You win!");
        } else if (game2Losses > game1Wins) {
            System.out.println("Game 2 won, Game 1 lost. You lose.");
        } else {
            System.out.println("It's a draw! Maybe next time you can play better.");
        }
    }
}
