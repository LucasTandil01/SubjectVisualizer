package martinez_lucas.subject_visualizer;
import lombok.*;

import java.util.Scanner;

@Getter
public abstract class User {
    private String username;
    private String password;
    private String name;

    User(String username, String password, String name){
        this.username = username;
        this.password = password;
        this.name = name;
    }
    public void login() {
        System.out.println();
        System.out.println("Welcome " + name + ".");
        menu();
    }

    public abstract void menu(); // This could be a GUI in the future

    @Override
    public boolean equals(Object o){
        return ((User)o).getUsername().equals(this.getUsername()) && ((User)o).getPassword().equals(this.getPassword());
    }

    @Override
    public String toString(){
        return "User: " + getName() +";\n";
    }
}
