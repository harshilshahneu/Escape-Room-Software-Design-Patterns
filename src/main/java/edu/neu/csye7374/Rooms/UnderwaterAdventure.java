package edu.neu.csye7374.Rooms;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye7374.APIs.PuzzleStrategy;

import edu.neu.csye7374.Models.Room;
import edu.neu.csye7374.Strategy.MCQPuzzleStrategy;
import edu.neu.csye7374.Strategy.OneWordPuzzleStrategy;
import edu.neu.csye7374.Strategy.PuzzleContextStrategy;

/**
 * Underwater Adventure room
 * Dive into an underwater world and solve puzzles to find your way out.
 */
public class UnderwaterAdventure extends Room {

    public UnderwaterAdventure(RoomBuilder builder) {
        super(builder);
    }

    public static class UnderwaterAdventureBuilder extends Room.RoomBuilder {

        @Override
        public Room build() {
            /**
             * Set the puzzles and exit puzzle here
             */
            PuzzleStrategy firstQuestion = new MCQPuzzleStrategy("What is the largest mammal in the ocean?", List.of("Dolphin", "Whale", "Shark", "Seal"), 2);
            PuzzleStrategy secondQuestion = new MCQPuzzleStrategy("What is a group of fish called?", List.of("Flock", "Herd", "School", "Pack"), 3);
            PuzzleStrategy finalQuestion = new OneWordPuzzleStrategy("Complete the phrase: 'Fish out of ...'", "Water");

            PuzzleContextStrategy firstPuzzle = new PuzzleContextStrategy(firstQuestion);
            PuzzleContextStrategy secondPuzzle = new PuzzleContextStrategy(secondQuestion);
            PuzzleContextStrategy finalPuzzle = new PuzzleContextStrategy(finalQuestion);

            List<PuzzleContextStrategy> puzzleList = new ArrayList<>();
            puzzleList.add(firstPuzzle);
            puzzleList.add(secondPuzzle);
            puzzleList.add(finalPuzzle);

            this.setId(3)
                .setName("UnderwaterAdventure")
                .setDescription("Dive into an underwater world filled with mysteries. Solve the puzzles to swim your way to freedom.")
                .setPuzzles(puzzleList)
                .setExitPuzzle(finalPuzzle);

            return new UnderwaterAdventure(this);
        }

    }

    @Override
    public void exitRoom() {
        System.out.println("You've successfully emerged from the depths of the underwater adventure.");
    }
}
