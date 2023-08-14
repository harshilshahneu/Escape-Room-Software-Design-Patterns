package edu.neu.csye7374.Rooms;

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye7374.APIs.PuzzleStrategy;

import edu.neu.csye7374.Models.Room;
import edu.neu.csye7374.Strategy.MCQPuzzleStrategy;
import edu.neu.csye7374.Strategy.OneWordPuzzleStrategy;
import edu.neu.csye7374.Strategy.Puzzle;

/**
 * jailbreak room
 * ideally this should be the first room
 */

 /**
  * Creating a jailbreak room -  JailBreak jailbreak = (JailBreak) new JailBreak.JailBreakBuilder().build();
  */
public class JailBreak extends Room {

    public JailBreak(RoomBuilder builder) {
        super(builder);
    }

    public static class JailBreakBuilder extends Room.RoomBuilder {

        @Override
        public Room build() {
            /**
             * Set the puzzles and exit puzzle here
             */
            PuzzleStrategy firstQuestion = new MCQPuzzleStrategy("System.out.println(Hello)", List.of("Hello", "World", "Hi", "Hey"), 1);
            PuzzleStrategy secondQuestion = new MCQPuzzleStrategy("System.out.println(World)", List.of("Hello", "World", "Hi", "Hey"), 2);
            PuzzleStrategy finalQuestion = new OneWordPuzzleStrategy("System.out.println(first + ' ' +second)", "Hello World");

            Puzzle firstPuzzle = new Puzzle(firstQuestion);
            Puzzle secondPuzzle = new Puzzle(secondQuestion);
            Puzzle finalPuzzle = new Puzzle(finalQuestion);

            List<Puzzle> puzzleList = new ArrayList<>();
            puzzleList.add(firstPuzzle);
            puzzleList.add(secondPuzzle);
            puzzleList.add(finalPuzzle);

            this.setId(1)
                .setName("JailBreak")
                .setDescription("You are in a jail cell. You need to escape the jail cell to enter the next room.")
                .setPuzzles(puzzleList)
                .setExitPuzzle(finalPuzzle);

            return new JailBreak(this);
        }

    }

    @Override
    public void exitRoom() {
        System.out.println();
    }
}
