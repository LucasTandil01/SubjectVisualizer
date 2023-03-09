package martinez_lucas.subject_visualizer;

import java.util.ArrayList;

public class Logger {

    public boolean verify(ArrayList<User> users, String username, String password){
        boolean successful = false;

        for(User u: users){
            if(u.getUsername().equals(username)) {
                if (u.getPassword().equals(password))
                    return true;
                else{
                    System.out.println("Incorrect password. Try again.");
                    break;
                }
            }
        }
        return successful;
    }
}
