public class SportsStats {
    private String playerName;
    private int totalMatchesPlayed;

    public SportsStats(String playerName) {
        this.playerName = playerName;
        this.totalMatchesPlayed = 0;
    }

    public void addMatch(int matchNumber, double points) {
        totalMatchesPlayed += matchNumber * points;
    }

    public static void main(String[] args) {
        String player1Name = "Player1";
        int matchesPlayedByPlayer1 = 50;
        SportsStats stats = new SportsStats(player1Name);

        System.out.println("Total matches played by " + player1Name + ": " + stats.totalMatchesPlayed);
        System.out.println("Matches played: " + matchesPlayedByPlayer1);
    }
}
