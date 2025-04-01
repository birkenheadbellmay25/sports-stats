import java.util.ArrayList;
import java.util.List;

public class SportsStats {

    private List<Stat> stats;

    public SportsStats() {
        this.stats = new ArrayList<>();
    }

    public void addStat(Stat stat) {
        this.stats.add(stat);
    }

    public int getAverageSpeed() {
        if (stats.isEmpty()) {
            throw new IllegalArgumentException("No statistics available.");
        }
        return stats.stream()
                    .mapToInt(Stat::getSpeed)
                    .average().orElse(0);
    }

    public static void main(String[] args) {
        SportsStats sportsStats = new SportsStats();
        Stat speedStat = new Stat("Speed", 8.5, "m/s");
        Stat accelerationStat = new Stat("Acceleration", 3.7, "m/s^2");

        sportsStats.addStat(speedStat);
        sportsStats.addStat(accelerationStat);

        System.out.println(sportsStats.getAverageSpeed());
    }
}
