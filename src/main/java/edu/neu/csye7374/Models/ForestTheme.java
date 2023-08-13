package edu.neu.csye7374.Models;

import java.util.List;

public class ForestTheme extends Themes {
    
    public ForestTheme() {
        super("Forest");
    }

    @Override
    public void loadRoom(List<Room> rooms) {
        
    }

    //use setter to set instructions
    @Override
    public void setInstructions(List<String> instructions) {
        super.setInstructions(instructions);
    }
    
}
