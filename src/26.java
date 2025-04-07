public class SportsStats {
    private static final String URL = "https://api.example.com/sports/athlete";

    public void fetchAthletes() {
        // Simulate fetching athletes data from the API
        // You can use any HTTP client library of your choice to do this

        // Example using HttpURLConnection
        try (HttpsURLConnection connection = (HttpsURLConnection) new URL(URL).openConnection()) {
            connection.setRequestMethod("GET");
            connection.connect();

            // Read and parse the JSON response data
            String responseJson = new Gson().toJson(connection.getResponseMessage());
            System.out.println(responseJson);
        }
    }

    public static void main(String[] args) {
        new SportsStats().fetchAthletes();
    }
}
