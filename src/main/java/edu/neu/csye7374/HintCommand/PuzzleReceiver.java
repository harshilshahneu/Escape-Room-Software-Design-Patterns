package edu.neu.csye7374.HintCommand;

import edu.neu.csye7374.APIs.HintReceiverAPI;
import edu.neu.csye7374.APIs.HintReceiverAdapteeAPI;
import edu.neu.csye7374.Strategy.PuzzleContextStrategy;

public class PuzzleReceiver implements HintReceiverAPI {


    HintReceiverAdapteeAPI obj;
    public PuzzleReceiver() {
        this.obj = new HintObject();
    }

    @Override
    public void generateHint(PuzzleContextStrategy strategy) {
       System.out.println("Sure!");
       System.out.println("Here is your hint for the given question:"); 
       this.obj.buildHint(strategy);
    }
    
}
