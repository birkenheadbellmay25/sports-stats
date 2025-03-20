package com.example.sportsstats;

public class Statistics {
    private int playerId;
    private String playerName;
    private int teamId;
    private String teamName;
    private double pointsScored;
    private int assists;
    private int rebounds;
    private int blocks;
    private int steals;
    private int gamesPlayed;

    public Statistics(int playerId, String playerName, int teamId, String teamName) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.teamId = teamId;
        this.teamName = teamName;
    }

    public void setPointsScored(double pointsScored) {
        this.pointsScored = pointsScored;
    }

    public double getPointsScored() {
        return pointsScored;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getAssists() {
        return assists;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    public int getRebounds() {
        return rebounds;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setSteals(int steals) {
        this.steals = steals;
    }

    public int getSteals() {
        return steals;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }
}
