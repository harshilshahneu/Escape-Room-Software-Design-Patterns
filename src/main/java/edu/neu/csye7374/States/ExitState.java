package edu.neu.csye7374.States;

import edu.neu.csye7374.APIs.PlayerStateAPI;

public class ExitState implements PlayerStateAPI {

    public void EntryStateOn() {
//        Not allowable operations from this state i.e ExitState -> EntryState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Entry State from Exit State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void BeginnerStateOn() {
//        Not allowable operations from this state i.e ExitState -> BeginnerState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Beginner State from Exit State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void IntermediateStateOn() {
//        Not allowable operations from this state i.e ExitState -> IntermediateState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Intermediate State from Exit State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void AdvancedStateOn() {
//        Not allowable operations from this state i.e ExitState -> AdvancedState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Advanced State from Exit State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void ExitStateOn() {
        System.out.println("Continuing with the ExitState ***************************");
        System.out.println("Hope you had fun playing the escape game ***************************");
    }


}