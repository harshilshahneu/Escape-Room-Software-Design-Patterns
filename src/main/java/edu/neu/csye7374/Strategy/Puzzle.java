package edu.neu.csye7374.Strategy;

import edu.neu.csye7374.APIs.PuzzleStrategy;

public class Puzzle {

private PuzzleStrategy puzzleStrategy;


public Puzzle(PuzzleStrategy puzzleStrategy){
    this.puzzleStrategy = puzzleStrategy;
}

public void display(){
    puzzleStrategy.display();
}

public boolean solve(String answer){
    return puzzleStrategy.solve(answer);
}

public PuzzleStrategy getPuzzleStrategy() {
        return puzzleStrategy;
    }
}
