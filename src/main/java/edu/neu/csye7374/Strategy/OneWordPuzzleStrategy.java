package edu.neu.csye7374.Strategy;

import edu.neu.csye7374.APIs.PuzzleStrategy;

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
        System.out.println("Question: " + this.question + " ?");
    }
}
