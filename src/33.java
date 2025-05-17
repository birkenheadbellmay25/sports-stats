public class SportsStats {
    private String playerName;
    private int gameId;
    private int season;
    private double winPercentage;
    private double homeAway;
    private int teamSize;

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getSeason() {
        return season;
    }

    public void setWinPercentage(double winPercentage) {
        this.winPercentage = winPercentage;
    }

    public double getWinPercentage() {
        return winPercentage;
    }

    public void setHomeAway(boolean homeAway) {
        if (homeAway) {
            this.homeAway = true;
        } else {
            this.homeAway = false;
        }
    }

    public boolean isHomeAway() {
        return homeAway;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }
}
