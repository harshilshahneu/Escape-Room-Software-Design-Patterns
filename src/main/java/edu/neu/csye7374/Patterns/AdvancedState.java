package edu.neu.csye7374.Patterns;

public class AdvancedState implements PlayerStateAPI {

    public void EntryStateOn() {
//        Not allowable operations from this state i.e AdvancedState -> EntryState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Entry State from Advanced State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void BeginnerStateOn() {
//        Not allowable operations from this state i.e AdvancedState -> BeginnerState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Beginner State from Advanced State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void IntermediateStateOn() {
//        Not allowable operations from this state i.e AdvancedState -> IntermediateState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Intermediate State from Advanced State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void AdvancedStateOn() {
        System.out.println("Continuing with the Advanced Room ***************************");
        System.out.println("All the best in trying to escape the rooms ***************************");
    }

    public void ExitStateOn() {
        System.out.println("Continuing with the ExitState ***************************");
        System.out.println("Hope you had fun playing the escape game ***************************");
    }

}