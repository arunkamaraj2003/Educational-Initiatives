package com.marsrover.command;

import com.marsrover.rover.MarsRover;

public class TurnRightCommand implements Command {
    private MarsRover rover;

    public TurnRightCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnRight();
    }
}
