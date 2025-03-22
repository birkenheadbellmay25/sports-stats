public class SportsStats {
    public static void main(String[] args) {
        // Example sports stats data
        double[] sportsData = {10, 20, 30, 40, 50, 60};
        
        System.out.println("Sports Data: " + Arrays.toString(sportsData));
        
        for (int i = 0; i < sportsData.length - 1; i++) {
            if (sportsData[i] >= sportsData[i + 1]) {
                double temp = sportsData[i];
                sportsData[i] = sportsData[i + 1];
                sportsData[i + 1] = temp;
                
                System.out.println("Swap " + i + " and " + (i + 1));
            }
        }

        for (double num : sportsData) {
            if (!Double.isNaN(num)) {
                System.out.printf("%.2f", num);
                System.out.print(", ");
            } else {
                System.out.print("\n");
            }
        }
    }
}
