package edu.neu.csye7374.Patterns;

public class BeginnerState implements PlayerStateAPI {

    public void EntryStateOn() {
//        Not allowable operations from this state i.e BeginnerState -> EntryState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Entry State from Beginner State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void BeginnerStateOn() {
        System.out.println("Statring with the Beginner Room ***************************");
        System.out.println("All the best in trying to escape the rooms ***************************");
    }

    public void IntermediateStateOn() {
        System.out.println("Continuing with the Intermediate Room ***************************");
        System.out.println("All the best in trying to escape the rooms ***************************");
    }

    public void AdvancedStateOn() {
//        Not allowable operations from this state i.e BeginnerState -> AdvancedState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Advanced State without successfully passing the Beginner State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    public void ExitStateOn() {
//        Not allowable operations from this state i.e BeginnerState -> ExitState
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Exit State without successfully passing the Advanced State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

}