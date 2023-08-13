package edu.neu.csye7374.Models;

import java.util.List;

public abstract class Themes {
    private String themeName;
    protected List<String> instructions;
    private List<Room> rooms;

    public Themes(String themeName) {
        this.themeName = themeName;
    }

    public void createTheme() {
        System.out.println("Creating theme: " + themeName);
        loadRoom(rooms);
    }

    public void loadRoom(List<Room> rooms){
        this.rooms = rooms;
    }

    public void provideInstructions() {
        System.out.println("Instructions for " + themeName + " theme:");
        for (String instruction : instructions) {
            System.out.println("- " + instruction);
        }
    }

    //Setter for instructions
    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

}




