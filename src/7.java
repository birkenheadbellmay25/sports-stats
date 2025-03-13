package com.example;

public class SportsStats {
    private int playerId;
    private String playerName;
    private int gamesPlayed;
    private int goalsScored;
    private int assistsGiven;
    private int penaltiesServed;
    private int foulsCommitted;
    private int yellowCardsReceived;
    private int redCardsReceived;

    public SportsStats(int playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getAssistsGiven() {
        return assistsGiven;
    }

    public void setAssistsGiven(int assistsGiven) {
        this.assistsGiven = assistsGiven;
    }

    public int getPenaltiesServed() {
        return penaltiesServed;
    }

    public void setPenaltiesServed(int penaltiesServed) {
        this.penaltiesServed = penaltiesServed;
    }

    public int getFoulsCommitted() {
        return foulsCommitted;
    }

    public void setFoulsCommitted(int foulsCommitted) {
        this.foulsCommitted = foulsCommitted;
    }

    public int getYellowCardsReceived() {
        return yellowCardsReceived;
    }

    public void setYellowCardsReceived(int yellowCardsReceived) {
        this.yellowCardsReceived = yellowCardsReceived;
    }

    public int getRedCardsReceived() {
        return redCardsReceived;
    }

    public void setRedCardsReceived(int redCardsReceived) {
        this.redCardsReceived = redCardsReceived;
    }
}
