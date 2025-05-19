public class SportsStats {
    private String teamName;
    private int season;
    private double totalWins;
    private double totalLosses;

    public SportsStats(String teamName, int season) {
        this.teamName = teamName;
        this.season = season;
    }

    // Example method to calculate total wins for a given season
    public double calculateTotalWins() {
        return 0.5; // Assuming the league uses a 50/50 split for win percentage
    }
}
