package edu.neu.csye7374.Strategy;

import edu.neu.csye7374.APIs.PuzzleStrategy;

import java.util.List;

public interface OneWordPuzzleFactory {

    public PuzzleStrategy createPuzzle(String question, String answer);
}
