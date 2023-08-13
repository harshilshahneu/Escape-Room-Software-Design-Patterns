package edu.neu.csye7374.Themes;

import java.util.List;

import edu.neu.csye7374.Models.Room;
import edu.neu.csye7374.Models.Themes;

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
