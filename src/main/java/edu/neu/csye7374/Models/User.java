package edu.neu.csye7374.Models;

import edu.neu.csye7374.APIs.PlayerStateAdapterAPI;
import edu.neu.csye7374.States.EntryState;

//Store the user details
//maintain the states of the user
public class User {
    UserProfile user;
    private PlayerStateAdapterAPI entryState;
    private PlayerStateAdapterAPI intermediateState;
    private PlayerStateAdapterAPI exitState;
    private PlayerStateAdapterAPI state;

    public User(UserProfile user) {
        this.user = user;
       
    }
}
