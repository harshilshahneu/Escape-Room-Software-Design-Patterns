package edu.neu.csye7374.Rooms;

import edu.neu.csye7374.Models.Room;

/**
 * jailbreak room
 * ideally this should be the first room
 */

 /**
  * Creating a jailbreak room -  JailBreak jailbreak = (JailBreak) new JailBreak.JailBreakBuilder().build();
  */
public class JailBreak extends Room {

    public JailBreak(RoomBuilder builder) {
        super(builder);
    }

    @Override
    public void enterRoom() {
        System.out.println("Welcome to " + this.getName() + "!");
        System.out.println(this.getDescription());

        //Display the instructions here

        //Start the timer once the user confirms the instructions
        //Call playRoom() method
    }

    @Override
    public void exitRoom() {
       System.out.println("You have successfully escaped the " + this.getName() + "!");
       //Move to the next room / Change the state of the game
    }

    @Override
    public void playRoom() {
        //Display the puzzles here and ask the user to solve them
    }
    
    public static class JailBreakBuilder extends Room.RoomBuilder {

        @Override
        public Room build() {
            this.setId(1)
                .setName("JailBreak")
                .setDescription("You are in a jail cell. You need to escape the jail cell to enter the next room.");
                // .setPuzzles(null)
                // .setExitPuzzle(null)
                // .setNextRoom(null);

            return new JailBreak(this);
        }

    }
}
