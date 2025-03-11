package com.example.sportsstats;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int number;
    private List<String> positions = new ArrayList<>();

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void addPosition(String position) {
        positions.add(position);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public List<String> getPositions() {
        return positions;
    }
}
