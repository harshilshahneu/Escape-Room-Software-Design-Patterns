package edu.neu.csye7374.Models;

/**
 * High level class to represent a game
 * A game will have multiple rooms
 * Example: Theme xyz requires user to escape 3 rooms
 * 
 * Using builder pattern to create a game
 */
public class Game {
    int id;
    String name;
    Room[] rooms;

    public Game(int id, String name, Room[] rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public static class GameBuilder {
        int id;
        String name;
        Room[] rooms;

        public GameBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public GameBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public GameBuilder setRooms(Room[] rooms) {
            this.rooms = rooms;
            return this;
        }

        public Game build() {
            return new Game(id, name, rooms);
        }
    }
}
