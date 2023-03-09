package martinez_lucas.subject_visualizer;

import java.util.ArrayList;

public class Logger {

    public User verify(ArrayList<User> users, String username, String password){
        for(User u: users){
            if(u.getUsername().equals(username)) {
                if (u.getPassword().equals(password))
                    return u;
                else{
                    System.out.println("Incorrect password. Try again.");
                    return null;
                }
            }
        }
        System.out.println("Username doesn't exists. Try again.");
        return null;
    }
}
