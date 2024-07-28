package com.marsrover;

import com.marsrover.command.*;
import com.marsrover.grid.Grid;
import com.marsrover.rover.Direction;
import com.marsrover.rover.MarsRover;
import com.marsrover.rover.Position;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        grid.addObstacle(2, 2);
        grid.addObstacle(3, 5);

        MarsRover rover = new MarsRover(new Position(0, 0), Direction.NORTH, grid);

        Command[] commands = {
                new MoveCommand(rover),
                new MoveCommand(rover),
                new TurnRightCommand(rover),
                new MoveCommand(rover),
                new TurnLeftCommand(rover),
                new MoveCommand(rover)
        };

        for (Command command : commands) {
            command.execute();
        }

        rover.statusReport();
    }
}