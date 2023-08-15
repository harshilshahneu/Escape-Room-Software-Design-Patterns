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
            PuzzleStrategy firstQuestion = new MCQPuzzleStrategy("What is the ghost's favorite food?", List.of("Pizza", "Brains", "Spaghetti", "Salad"), 1);
            PuzzleStrategy secondQuestion = new MCQPuzzleStrategy("What instrument does a skeleton play?", List.of("Guitar", "Flute", "Xylophone", "Trombone"), 3);
            PuzzleStrategy finalQuestion = new OneWordPuzzleStrategy("Complete the phrase: 'Trick or ...'", "Treat");

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

