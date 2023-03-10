package martinez_lucas.subject_visualizer;
import lombok.*;

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
    public void login() { // This could be a GUI in the future
        System.out.println();
        System.out.println("Welcome " + name + ".");
        Menu menu = new Menu(this);
        menu.displayMenu();
    }

    @Override
    public boolean equals(Object o){
        return ((User)o).getUsername().equals(this.getUsername()) && ((User)o).getPassword().equals(this.getPassword());
    }

    @Override
    public String toString(){
        return "User: " + getName() +";\n";
    }
}
