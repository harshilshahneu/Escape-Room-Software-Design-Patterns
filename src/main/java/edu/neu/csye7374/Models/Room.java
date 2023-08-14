package edu.neu.csye7374.Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.neu.csye7374.Strategy.Puzzle;

/**
 * In a game there will be multiple rooms
 * Example: Theme xyz requires user to escape 3 rooms
 * Room 1 -> Room 2 -> Room 3 -> Escape (in that order)
 * 
 * Abstract class to represent a room
 */

 /**
  * Code Implementattion Reference: https://dev.to/karthikrg/implementing-builder-pattern-abstract-class-3c1l
  */

 public abstract class Room {
    private int id;
    private String name; // name of the room
    private String description; // description of the room
    private List<Puzzle> puzzles; // puzzles in the room
    private Puzzle exitPuzzle; // id of the puzzle that will lead to the next room // null if no next room

    public Room(RoomBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.puzzles = builder.puzzles;
        this.exitPuzzle = builder.exitPuzzle;
    }
    /**
     * Getters
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() { 
        return description;
    }

    public List<Puzzle> getPuzzles() {
        return puzzles;
    }

    public Puzzle getExitPuzzle() {
        return exitPuzzle;
    }

    public Puzzle removePuzzle(int index) {
        return puzzles.remove(index);
    }

    public void displayPuzzles(Map <Integer, Puzzle> puzzlesMap) {
        for (Map.Entry<Integer, Puzzle> entry : puzzlesMap.entrySet()) {
            System.out.print("Puzzle " + entry.getKey() + ". ");
            entry.getValue().display();
            System.out.println();
        }
    }
    /**
     * Get the user aquainted with the room
     */
    public void enterRoom(UserProfile user) {
        System.out.println("Welcome :" + user);
        System.out.println("Looks like you have entered the " + this.getName() + "!");
        System.out.println("About this room: " + this.getDescription());
        System.out.println("Now, you'll be displayed a list of puzzles.");
        System.out.println("You can solve them in any order, but you don't need to solve all of them to escape the room.");
        System.out.println("Press 1 to start solving the puzzles.");
        int choice = 0;

        //Start the timer once the user confirms the instructions
        do {
            try {
                choice = Integer.parseInt(System.console().readLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
            //Call playRoom() method
        } while (choice != 1);


        playRoom();
    }

    public void playRoom() {
        Map<Integer, Puzzle> puzzlesMap = createPuzzlesMap();
    
        while (!puzzlesMap.isEmpty()) {
            System.out.println("===========================================");
            System.out.println("Puzzles remaining in this room: " + puzzlesMap.size());
            displayPuzzles(puzzlesMap);
            System.out.println("===========================================");
            int puzzleNumber = readPuzzleNumber();
    
            if (puzzlesMap.containsKey(puzzleNumber)) {
                solvePuzzle(puzzleNumber, puzzlesMap);
            } else {
                System.out.println("Invalid puzzle number. Please try again.");
            }
        }
    
        exitRoom();
    }
    
    private Map<Integer, Puzzle> createPuzzlesMap() {
        Map<Integer, Puzzle> puzzlesMap = new HashMap<>();
        for (int i = 0; i < puzzles.size(); i++) {
            puzzlesMap.put(i + 1, puzzles.get(i));
        }
        return puzzlesMap;
    }
    
    private int readPuzzleNumber() {
        System.out.println("Enter the puzzle number you want to solve: ");
        int puzzleNumber = 0;
        try {
            puzzleNumber = Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
        return puzzleNumber;
    }
    
    private void solvePuzzle(int puzzleNumber, Map<Integer, Puzzle> puzzlesMap) {
        System.out.println("Enter your answer for puzzle number " + puzzleNumber + ": ");
        String answer = System.console().readLine();
    
        Puzzle puzzle = puzzlesMap.get(puzzleNumber);
        if (puzzle.solve(answer)) {
            System.out.println("Correct answer!");
            System.out.println("===========================================");
            puzzlesMap.remove(puzzleNumber);
    
            if (puzzle == exitPuzzle) {
                //the room has been solved
                puzzlesMap.clear();
            }
        } else {
            System.out.println("Wrong answer! Try again.");
            System.out.println("===========================================");
        }
    }
    
    abstract public void exitRoom();

    /**
     * Since room requires too many parameters, we are using builder pattern to create a room
     */
    public abstract static class RoomBuilder {
        int id;
        String name;
        String description;
        List<Puzzle> puzzles;
        Puzzle exitPuzzle = null; //default value

        public RoomBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public RoomBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public RoomBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public RoomBuilder setPuzzles(List<Puzzle> puzzles) {
            this.puzzles = puzzles;
            return this;
        }

        public RoomBuilder setExitPuzzle(Puzzle puzzle) {
            this.exitPuzzle = puzzle;
            return this;
        }

        public abstract Room build();
    }
   

 }