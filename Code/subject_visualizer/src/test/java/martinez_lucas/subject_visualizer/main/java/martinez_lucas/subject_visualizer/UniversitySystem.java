package martinez_lucas.subject_visualizer;

import java.util.ArrayList;
import java.util.Scanner;

public class UniversitySystem {
    private ArrayList<User> users;
    private Logger logger;
    public void start(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        logger.verify(users,user,pass);
    }


    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }
}
