package edu.neu.csye7374.Models;

import java.util.List;

public abstract class Theme {
    private String themeName;
    protected List<String> instructions;
    private List<Room> rooms; //the rooms are in order, so we can use this to load the rooms in order
    private UserProfile user; //the user who is playing the game

    public Theme(UserProfile user) {
        this.user = user;
    }

    public UserProfile getUserProfile() {
        return user;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }
    
    public abstract void createTheme();

    public abstract void loadRooms();

    public abstract void loadInstructions();

    public void provideInstructions() {
        System.out.println("Instructions for " + themeName + " theme:");
        for (String instruction : instructions) {
            System.out.println("- " + instruction);
        }
    }

    public void exitTheme() {
        System.out.println("Exiting " + themeName + " theme");
    }
    //start the game
    public void start() {
        //remove the first room from the list
        while (rooms.size() > 0) {
            Room room = rooms.remove(0);
            room.enterRoom(getUserProfile());
        }
    }
    
    //template method
    public void play() {
        createTheme();
        loadInstructions();
        loadRooms();
        provideInstructions();
        start();
        exitTheme();
    }
}




