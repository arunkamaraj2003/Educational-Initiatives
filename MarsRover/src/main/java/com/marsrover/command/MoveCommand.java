package com.marsrover.command;

import com.marsrover.rover.MarsRover;

public class MoveCommand implements Command {
    private MarsRover rover;

    public MoveCommand(MarsRover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.move();
    }
}