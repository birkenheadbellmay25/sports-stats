public class SportsStats {
    private String team;
    private int points;
    private int goals;

    public SportsStats(String team, int points, int goals) {
        this.team = team;
        this.points = points;
        this.goals = goals;
    }

    public void addGoal() {
        goals++;
    }

    public void updateTeamName(String newTeam) {
        team = newTeam;
    }

    @Override
    public String toString() {
        return "SportsStats{" +
                "team='" + team + '\'' +
                ", points=" + points +
                ", goals=" + goals +
                '}';
    }
}
