package edu.neu.csye7374.States;

import edu.neu.csye7374.APIs.PlayerStateAPI;

public class IntermediateState implements PlayerStateAPI{

    public void EntryStateOn() {
//        Not allowable operations from this state i.e IntermediateState -> EntryState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Entry State from Intermediate State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void BeginnerStateOn() {
//        Not allowable operations from this state i.e IntermediateState -> BeginnerState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Beginner State from Intermediate State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void IntermediateStateOn() {
        System.out.println("Continuing with the Intermediate Room ***************************");
        System.out.println("All the best in trying to escape the rooms ***************************");
    }

    public void AdvancedStateOn() {
        System.out.println("Continuing with the Advanced Room ***************************");
        System.out.println("All the best in trying to escape the rooms ***************************");
    }

    public void ExitStateOn() {
//        Not allowable operations from this state i.e IntermediateState -> ExitState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Exit State without successfully passing the Advanced State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

}