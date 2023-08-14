package edu.neu.csye7374.Strategy;

import edu.neu.csye7374.APIs.PuzzleStrategy;

import java.util.List;

public class MCQPuzzleStrategy implements PuzzleStrategy {
    String question;
    List<String> options;
    int correctOption;

    public MCQPuzzleStrategy(String question, List<String> options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }
    @Override
    public boolean solve(String answer) {
        try {
            int option = Integer.parseInt(answer);
            return option == correctOption;
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter a valid option number!");
            return false;
        }
    }

    @Override
    public void display() {
        System.out.println("Question: " + this.question);
        int index=0;
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }

    }
}

