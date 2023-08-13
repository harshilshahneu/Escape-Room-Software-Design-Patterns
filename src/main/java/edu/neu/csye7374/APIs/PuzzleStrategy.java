package edu.neu.csye7374.APIs;

import edu.neu.csye7374.Models.Puzzle;
import edu.neu.csye7374.Models.Room;

public interface PuzzleStrategy {
    boolean solve(String answer);
}
