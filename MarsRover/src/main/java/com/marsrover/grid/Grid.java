package com.marsrover.grid;

import java.util.HashSet;
import java.util.Set;

public class Grid {
    private int width;
    private int height;
    private Set<Obstacle> obstacles;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.obstacles = new HashSet<Obstacle>();
    }

    public void addObstacle(int x, int y) {
        obstacles.add(new Obstacle(x, y));
    }

    public boolean isObstacle(int x, int y) {
        return obstacles.contains(new Obstacle(x, y));
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}