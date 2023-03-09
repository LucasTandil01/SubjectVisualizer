package martinez_lucas.subject_visualizer;

import lombok.*;

import java.util.ArrayList;

@Getter
public class Student extends User{
    private ArrayList<Subject> subjects;
    Student(String username, String password) {
        super(username, password);
    }

    public void seeSubjects(){
        System.out.println(subjects);
    }

}
