package martinez_lucas.subject_visualizer;

import java.util.ArrayList;
import java.util.Scanner;

public class UniversitySystem {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Subject> subjects = new ArrayList<>();
    private Logger logger = new Logger();

    public void start(){
        addUser(new Professor("P_111","12345", "Oscar"));
        addUser(new Professor("P_112","12345", "Carlos"));
        addUser(new Professor("P_113","12345", "Rebecca"));
        addUser(new Professor("P_114","12345", "Mario"));
        addUser(new Professor("P_115","12345", "Alejandra"));
        addUser(new Student("S_1111","67890","Lucas"));
        addUser(new Student("S_1112","67890","Wilmer"));
        addUser(new Student("S_1113","67890","Manuel"));
        addUser(new Student("S_1114","67890","Will"));
        addUser(new Student("S_1115","67890","Kevin"));
        addSubject("Programming",(Professor) users.get(0));
        addSubject("SOLID Principles",(Professor) users.get(1));
        addSubject("English",(Professor) users.get(2));
        addSubject("Reinforcement",(Professor) users.get(3));
        addSubject("Socio-emotional",(Professor) users.get(4));

        for(User u: users){
            if(u.getUsername().startsWith("S_")){
                ((Student)u).addSubject(subjects.get(0));
                ((Student)u).addSubject(subjects.get(1));
                ((Student)u).addSubject(subjects.get(2));
                if(u.getUsername().endsWith("2") || u.getUsername().endsWith("4")){
                    ((Student)u).addSubject(subjects.get(3));
                    ((Student)u).addSubject(subjects.get(4));
                }
            }
        }

        login();
    }

    public void login(){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String username = sc.nextLine();
        System.out.print("Password: ");
        String password = sc.nextLine();
        User user = logger.verify(users,username,password);
        if(user == null)
            login();
        else
            user.login();
        System.out.println("Do you want to exit app? \n 1. Yes. \n 2. No.");
        int option = sc.nextInt();
        if(option == 2)
            login();
    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public void addSubject(String name, Professor professor){
        Subject subject = new Subject(name,professor);
        professor.addSubject(subject);
        subjects.add(subject);
    }
}
