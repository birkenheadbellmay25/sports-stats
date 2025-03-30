import org.apache.commons.lang3.StringUtils;
import java.util.*;
public class SportsStats {
    public void trackSportsStatistics() {
        String[] athletes = { "LeBron James", "Michael Jordan", "Cristiano Ronaldo" };
        
        System.out.println("Athletes: ");
        for (String athlete : athletes) {
            System.out.println("- " + athlete);
        }
    }
}
