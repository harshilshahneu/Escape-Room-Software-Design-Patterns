package edu.neu.csye7374.Strategy;

import edu.neu.csye7374.APIs.PuzzleStrategy;
import edu.neu.csye7374.Models.Puzzle;

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
        int option = Integer.parseInt(answer);
        return option == correctOption;
    }


    @Override
    public void display() {
        System.out.println(this.question);
        int index=0;
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }

    }
}

