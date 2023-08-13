package edu.neu.csye7374.Patterns;

public class EntryState implements PlayerStateAPI {

        public void EntryStateOn() {
            System.out.println("------------------------------------Wecome to the Escape Room-------------------------------------");
            System.out.println("Start by adding your credentials: ***************************");
        }

        public void BeginnerStateOn() {
//        Allowed operations from Entry state to Beginner state
            System.out.println("Statring with the Beginner Room ***************************");
            System.out.println("All the best in trying to escape the rooms ***************************");
        }

        public void IntermediateStateOn() {
//        Not allowable operations from this state i.e EntryState -> IntermediateState
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Intermediate State without successfully passing the Beginner State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        }

        public void AdvancedStateOn() {
//        Not allowable operations from this state i.e EntryState -> AdvancedState
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Advanced State without successfully passing the Beginner State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        }

        public void ExitStateOn() {
//        Not allowable operations from this state i.e EntryState -> ExitState
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ERROR: Can't escape to the Exit State without successfully passing the Advanced State XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        }

}