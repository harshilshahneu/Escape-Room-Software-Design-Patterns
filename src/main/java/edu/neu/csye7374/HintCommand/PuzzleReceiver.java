package edu.neu.csye7374.HintCommand;

import edu.neu.csye7374.APIs.HintReceiverAPI;
import edu.neu.csye7374.APIs.PuzzleStrategy;

public class PuzzleReceiver implements HintReceiverAPI {



    @Override
    public void generateHint(PuzzleStrategy strategy) {
       System.out.println("Sure!");
       System.out.println("Here is your hint for the given question:"); 
       strategy.showHint();
    }
    
}
