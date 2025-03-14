import java.util.ArrayList;
import java.util.List;

public class SportsStats {
    private List<Player> players = new ArrayList<>();
    private List<Match> matches = new ArrayList<>();
    
    public void addPlayer(String name, int age) {
        Player player = new Player(name, age);
        players.add(player);
    }
    
    public void addMatch(int team1Score, int team2Score) {
        Match match = new Match(team1Score, team2Score);
        matches.add(match);
    }
    
    public void analyze() {
        // Analysis code goes here
    }
}
