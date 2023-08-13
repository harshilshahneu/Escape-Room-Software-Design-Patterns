package edu.neu.csye7374.Models;

public abstract  class Puzzle {

private String question;

    public Puzzle(String Question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public abstract  boolean solve(String answer);
}
