package edu.neu.csye7374.Strategy;

import edu.neu.csye7374.APIs.PuzzleStrategy;
import edu.neu.csye7374.Models.Puzzle;
import edu.neu.csye7374.Models.Room;

public class OneWordPuzzleStrategy implements PuzzleStrategy {
    String question;
    String answer;

    public OneWordPuzzleStrategy(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    public boolean solve(String answer) {
        return answer.equals(this.answer);
    }

    @Override
    public void display() {
        System.out.println(this.question);
    }
}
