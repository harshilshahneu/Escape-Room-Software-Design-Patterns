package edu.neu.csye7374.Models;

/**
 * In a game there will be multiple rooms
 * Example: Theme xyz requires user to escape 3 rooms
 * Room 1 -> Room 2 -> Room 3 -> Escape (in that order)
 * 
 * Using builder pattern to create a room
 */
public class Room {
    int id;
    String name;
    Puzzle[] puzzles;

    public Room(int id, String name, Puzzle[] puzzles) {
        this.id = id;
        this.name = name;
        this.puzzles = puzzles;
    }

    public static class RoomBuilder {
        int id;
        String name;
        Puzzle[] puzzles;

        public RoomBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public RoomBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public RoomBuilder setPuzzles(Puzzle[] puzzles) {
            this.puzzles = puzzles;
            return this;
        }

        public Room build() {
            return new Room(id, name, puzzles);
        }
    }
}
