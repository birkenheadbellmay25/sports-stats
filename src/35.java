public class SportsStats {
    public static void main(String[] args) {
        // Example: Find the player with the most points per game in the last 5 games
        int maxPoints = 0;
        String playerName = null;
        for (int i = 0; i < 5; i++) {
            double currentPoints = calculatePoints(new Game());
            if (currentPoints > maxPoints) {
                maxPoints = currentPoints;
                playerName = players[i];
            }
        }

        System.out.println("The player with the most points per game in the last 5 games is " + playerName);
    }

    private static double calculatePoints(Game game) {
        // Implement logic to calculate points
        // For example, you can assume that each point corresponds to a score of 1000 in points
        return 1000;
    }
}

class Game {
    public int gameId; // Example: gameId = 12345

    public double calculatePoints() {
        // Implement logic to calculate points for the game
        // For example, assuming each point corresponds to a score of 10 in points
        return 10;
    }
}
