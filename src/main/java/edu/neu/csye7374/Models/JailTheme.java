package edu.neu.csye7374.Models;

import java.util.List;

public class JailTheme extends Themes{
    
    public JailTheme() {
        super("Jail");
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
