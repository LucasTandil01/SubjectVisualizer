package martinez_lucas.subject_visualizer;

import java.util.ArrayList;
import java.util.Scanner;

public final class LOGGER {

    public static void login(ArrayList<User> users){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        User user = verify(users,username,password);
        if(user == null)
            login(users);
        else{
            user.login();
            System.out.println("Do you want to exit app? \n 1. Yes. \n 2. No.");
            int option = sc.nextInt();
            if(option == 2)
                login(users);
        }
    }
    public static User verify(ArrayList<User> users, String username, String password){
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
