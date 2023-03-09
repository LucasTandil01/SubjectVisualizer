package martinez_lucas.subject_visualizer;
import lombok.*;

import java.util.Scanner;

@Getter @Setter
public abstract class User {
    private String username;
    private String password;

    User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public void login() {

    }
}
