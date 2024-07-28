package com.marsrover.command;

import com.marsrover.rover.MarsRover;

public class TurnLeftCommand implements Command {
    private MarsRover rover;

    public TurnLeftCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnLeft();
    }
}
