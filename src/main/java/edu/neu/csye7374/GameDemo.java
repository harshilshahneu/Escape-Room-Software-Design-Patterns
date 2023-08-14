package edu.neu.csye7374;

import java.util.Random;
import edu.neu.csye7374.Models.Theme;
import edu.neu.csye7374.Models.User;
import edu.neu.csye7374.Models.UserProfile;
import edu.neu.csye7374.Themes.CodingTheme;
import edu.neu.csye7374.Themes.ForestTheme;

public class GameDemo {

    public static UserProfile getUserProfile() {
        System.out.println("Please enter your name");
        String name = System.console().readLine();
        System.out.println("Please enter your email");
        String email = System.console().readLine();
        //generate a random id
        Random rand = new Random();
        int id = rand.nextInt(1000);
        UserProfile user = new UserProfile.UserProfileBuilder()
                .setId(id)
                .setUserName(name)
                .setEmail(email)
                .build();

        return user;
    }
    
    public static Theme getThemeFromUser(User user) {
        System.out.println("Please select a theme");
        System.out.println("1. Forest");
        System.out.println("2. Coding");
        int themeId = Integer.parseInt(System.console().readLine());
        Theme theme = null;
        switch (themeId) {
            case 1:
               //use factories to create the theme
                theme = new ForestTheme(user); //Decorator pattern
                break;
            case 2:
                theme = new CodingTheme(user);
                break;
            default:
                System.out.println("Invalid theme selected");
                break;
        }
        return theme;
    }
    public static void main(String[] args) {
    //    UserProfile user = new UserProfile(1, "John", "jon@gmail.com");
    //    Room jailbreak = (Room) EagerSingletonJailBreakFactory.getInstance().createRoom();
    //    jailbreak.enterRoom(user);

        //get the user details
        System.out.println("Welcome to Escape Room Game");
        User user = new User(getUserProfile());
        // System.out.println(user);
        user.displayState();
        Theme theme = getThemeFromUser(user);
        theme.play();
        //Select a theme
    
    }
}
