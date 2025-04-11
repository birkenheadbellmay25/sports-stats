import java.util.Random;

public class SportsStats {
    public static void main(String[] args) {
        // Generate a random number between 1 and 99
        Random rand = new Random();
        int randomNum = rand.nextInt(99);
        
        // Display the result as "Number: [randomNum]"
        System.out.println("Number: " + randomNum);
    }
}
