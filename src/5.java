public class SportsStats {
    private static final String team = "ABC";
    private static final int wins = 20;
    private static final int losses = 10;
    private static final double winPercentage = (double) wins / (wins + losses);

    public static void main(String[] args) {
        System.out.println("Team: " + team);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.printf("Win percentage: %.2f\n", winPercentage);
    }
}
