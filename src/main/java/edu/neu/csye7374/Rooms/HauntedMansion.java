package edu.neu.csye7374.Rooms;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye7374.APIs.PuzzleStrategy;

import edu.neu.csye7374.Models.Room;
import edu.neu.csye7374.Strategy.MCQPuzzleStrategy;
import edu.neu.csye7374.Strategy.OneWordPuzzleStrategy;
import edu.neu.csye7374.Strategy.PuzzleContextStrategy;

/**
 * Haunted Mansion room
 * A spooky room where players must solve puzzles to escape the ghostly mansion.
 */
public class HauntedMansion extends Room {

    public HauntedMansion(RoomBuilder builder) {
        super(builder);
    }

    public static class HauntedMansionBuilder extends Room.RoomBuilder {

        @Override
        public Room build() {
            /**
             * Set the puzzles and exit puzzle here
             */
            PuzzleStrategy firstQuestion = new MCQPuzzleStrategy(
                "What does the following code snippet do?",
                List.of("Sorts an array in ascending order", "Calculates the average of an array", "Finds the maximum element in an array", "Counts the number of odd elements in an array"),
                0,
                "The code snippet uses a sorting algorithm to arrange the elements of an array in ascending order."
            );
    
            PuzzleStrategy secondQuestion = new MCQPuzzleStrategy(
                "What is the time complexity of a binary search algorithm?",
                List.of("O(1)", "O(n)", "O(log n)", "O(n log n)"),
                2,
                "The binary search algorithm has a time complexity of O(log n) in the average and worst cases."
            );
    
            PuzzleStrategy finalQuestion = new OneWordPuzzleStrategy(
                "Which design pattern promotes the creation of objects without specifying their exact class",
                "Factory",
                "The Factory design pattern allows the creation of objects through a common interface without specifying their concrete class."
            );
            PuzzleContextStrategy firstPuzzle = new PuzzleContextStrategy(firstQuestion);
            PuzzleContextStrategy secondPuzzle = new PuzzleContextStrategy(secondQuestion);
            PuzzleContextStrategy finalPuzzle = new PuzzleContextStrategy(finalQuestion);

            List<PuzzleContextStrategy> puzzleList = new ArrayList<>();
            puzzleList.add(firstPuzzle);
            puzzleList.add(secondPuzzle);
            puzzleList.add(finalPuzzle);

            this.setId(2)
                .setName("HauntedMansion")
                .setDescription("You are trapped in a spooky haunted mansion. Solve the puzzles to escape its ghostly grasp.")
                .setPuzzles(puzzleList)
                .setExitPuzzle(finalPuzzle);

            return new HauntedMansion(this);
        }

    }

    @Override
    public void exitRoom() {
        System.out.println("Congratulations! You've escaped the haunted mansion.");
    }
}

