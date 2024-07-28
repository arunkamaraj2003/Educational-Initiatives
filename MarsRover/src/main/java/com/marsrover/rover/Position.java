package com.marsrover.rover;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Position nextPosition(Direction direction) {
        switch (direction) {
            case NORTH:
                return new Position(x, y + 1);
            case EAST:
                return new Position(x + 1, y);
            case SOUTH:
                return new Position(x, y - 1);
            case WEST:
                return new Position(x - 1, y);
        }
        return null;
    }
}
