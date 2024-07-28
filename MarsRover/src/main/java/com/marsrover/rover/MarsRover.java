package com.marsrover.rover;

import com.marsrover.grid.Grid;

public class MarsRover {
    private Position position;
    private Direction direction;
    private Grid grid;

    public MarsRover(Position position, Direction direction, Grid grid) {
        this.position = position;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        Position newPosition = position.nextPosition(direction);
        if (grid.isWithinBounds(newPosition.getX(), newPosition.getY())
                && !grid.isObstacle(newPosition.getX(), newPosition.getY())) {
            position = newPosition;
        } else {
            System.out.println("Move blocked by obstacle or boundary.");
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void statusReport() {
        System.out.printf("Rover is at (%d, %d) facing %s.%n", position.getX(), position.getY(), direction);
    }
}
