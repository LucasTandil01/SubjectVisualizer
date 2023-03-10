package martinez_lucas.subject_visualizer;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends User{
    private ArrayList<Subject> subjects;
    static Scanner sc = new Scanner(System.in);
    Professor(String username, String password, String name) {
        super(username, password, name);
        this.subjects = new ArrayList<>();
    }

    public void uploadMark(){
        System.out.println(subjects);
        System.out.print("Select position of the subject: ");
        int position = sc.nextInt();
        Subject subject = subjects.get(position);

        System.out.println(subject.getStudents());
        System.out.print("Select position of the student: ");
        position = sc.nextInt();
        Student student = subject.getStudents().get(position);

        System.out.print("Which is the mark?: ");
        double mark = sc.nextDouble();

        ArrayList<Subject> student_subjects = student.getSubjects();
        int sub_pos = student_subjects.indexOf(subject);
        student_subjects.get(sub_pos).setMark(mark,this);

    }

    public void addSubject(Subject subject){
        subjects.add(subject);
    }

    public void removeSubject(Subject subject){
        subjects.remove(subject);
    }
}
