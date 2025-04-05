public class SportsStats {
    private int playerIds;
    private double[] data;

    public SportsStats() {
        this.playerIds = 0;
        this.data = new double[50];
    }

    public void addPlayerId(int playerId) {
        if (playerIds == 0) {
            this.playerIds = playerId;
        } else {
            this.playerIds = Math.max(playerIds, playerId);
        }
        for (int i = 0; i < data.length && data[i] <= playerIds; i++) {
            data[i] += 1.0 / (playerIds - i + 1);
        }
    }

    public double[] getData() {
        return this.data;
    }

    public void setData(double[][] data) {
        this.data = new double[data.length][];
        for (int i = 0; i < this.playerIds; i++) {
            this.data[i] = data[i];
        }
    }

    public static void main(String[] args) {
        SportsStats stats = new SportsStats();
        System.out.println(stats.getData());
    }
}
