  public class SportsStats {
    private Map<String, Integer> playerPoints;
    private Map<String, Integer> teamPoints;

    public SportsStats() {
      playerPoints = new HashMap<>();
      teamPoints = new HashMap<>();
    }

    public void addPlayer(String playerName) {
      if (!playerPoints.containsKey(playerName)) {
        playerPoints.put(playerName, 0);
      }
    }

    public void addPoint(String playerName) {
      int points = playerPoints.get(playerName);
      points++;
      playerPoints.put(playerName, points);
    }

    public void addTeam(String teamName) {
      if (!teamPoints.containsKey(teamName)) {
        teamPoints.put(teamName, 0);
      }
    }

    public void addTeamPoint(String teamName) {
      int points = teamPoints.get(teamName);
      points++;
      teamPoints.put(teamName, points);
    }

    public Map<String, Integer> getPlayerPoints() {
      return playerPoints;
    }

    public Map<String, Integer> getTeamPoints() {
      return teamPoints;
    }
  }