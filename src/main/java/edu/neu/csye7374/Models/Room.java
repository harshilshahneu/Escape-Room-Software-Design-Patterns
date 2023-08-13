package edu.neu.csye7374.Models;

import java.util.List;

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

    abstract public void enterRoom();
    abstract public void exitRoom();
    abstract public void playRoom();

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