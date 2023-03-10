package martinez_lucas.subject_visualizer;

import lombok.*;

import java.util.ArrayList;

@Getter
public class Student extends User{
    private ArrayList<Subject> subjects;
    Student(String username, String password, String name) {
        super(username, password, name);
        this.subjects = new ArrayList<>();
    }
}
