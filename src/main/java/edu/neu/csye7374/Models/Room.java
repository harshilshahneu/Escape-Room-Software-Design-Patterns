package edu.neu.csye7374.Models;

import java.util.List;

/**
 * In a game there will be multiple rooms
 * Example: Theme xyz requires user to escape 3 rooms
 * Room 1 -> Room 2 -> Room 3 -> Escape (in that order)
 * 
 * Abstract class to represent a room
 */

 public abstract class Room {
    int id;
    String name; // name of the room
    String description; // description of the room
    List<Puzzle> puzzles; // puzzles in the room
    Puzzle exitPuzzle; // id of the puzzle that will lead to the next room // null if no next room
    Room nextRoom; // ids of the next rooms // null if no next room

    public Room(int id, String name, String description, List<Puzzle> puzzles, Room nextRoom, Puzzle exitPuzzle) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.puzzles = puzzles;
        this.nextRoom = nextRoom;
        this.exitPuzzle = exitPuzzle;
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
        Room nextRoom = null; //default value

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

        public RoomBuilder setNextRoom(Room room) {
            this.nextRoom = room;
            return this;
        }

        public RoomBuilder setExitPuzzle(Puzzle puzzle) {
            this.exitPuzzle = puzzle;
            return this;
        }

        abstract public Room build();
    }
   

 }