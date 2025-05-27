public class SportsStats {
    private String teamName;
    private double pointsPerGame;

    public SportsStats(String teamName, double pointsPerGame) {
        this.teamName = teamName;
        this.pointsPerGame = pointsPerGame;
    }

    public void addGame(double score) {
        if (score > 0 && score <= 10) { // example: a game with a score of 8 would be added
            pointsPerGame += score * 1.5; // adjust the points per game based on score
        } else if (score > -20) { // another scenario where we can add games
            this.teamName = "Other";
            pointsPerGame -= 5; // subtract 5 from pointsPerGame as we're adding a new team
            return;
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public double getPointsPerGame() {
        return pointsPerGame;
    }
}
