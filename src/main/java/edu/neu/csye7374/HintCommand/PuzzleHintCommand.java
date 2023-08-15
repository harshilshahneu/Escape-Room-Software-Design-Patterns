package edu.neu.csye7374.HintCommand;

import edu.neu.csye7374.APIs.HintCommandAPI;
import edu.neu.csye7374.APIs.HintReceiverAPI;
import edu.neu.csye7374.APIs.PuzzleStrategy;

public class PuzzleHintCommand implements HintCommandAPI {
    HintReceiverAPI receiverAPI;
    PuzzleStrategy strategy;

    public PuzzleHintCommand(HintReceiverAPI receiverAPI,PuzzleStrategy strategy){
        this.receiverAPI= receiverAPI;
    }

    @Override
    public void execute() {
       this.receiverAPI.generateHint(strategy);
        
    }
    


}
