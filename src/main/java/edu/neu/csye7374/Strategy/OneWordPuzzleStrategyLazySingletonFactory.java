package edu.neu.csye7374.Strategy;

import edu.neu.csye7374.APIs.PuzzleStrategy;

import java.util.List;

public class OneWordPuzzleStrategyLazySingletonFactory implements  OneWordPuzzleFactory{

    private static OneWordPuzzleStrategyLazySingletonFactory instance;


    private OneWordPuzzleStrategyLazySingletonFactory(){
    instance= null;
    }

    public static synchronized OneWordPuzzleStrategyLazySingletonFactory getInstance(){

        if(instance == null) {

                instance = new OneWordPuzzleStrategyLazySingletonFactory();


        }

        return  instance;
    }

    @Override
    public PuzzleStrategy createPuzzle(String question, String answer) {
        return new OneWordPuzzleStrategy(question, answer);
    }

}
