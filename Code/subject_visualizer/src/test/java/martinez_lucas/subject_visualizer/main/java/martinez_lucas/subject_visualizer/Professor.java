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

    private void uploadMark(){
        System.out.println(subjects);
        System.out.print("Select position of the subject: ");
        int position = sc.nextInt();
        Subject subject = subjects.get(position);

        System.out.println(subject.getStudents());
        System.out.print("Select position of the student: ");
        position = sc.nextInt();
        Student student = subject.getStudents().get(position);

        System.out.print("Which is the mark?");
        double mark = sc.nextDouble();

        ArrayList<Subject> student_subjects = student.getSubjects();
        int sub_pos = student_subjects.indexOf(subject);
        student_subjects.get(sub_pos).setMark(mark,this);

    }

    public void addSubject(Subject subject){
        subjects.add(subject);
    }

    public void removeubject(Subject subject){
        subjects.remove(subject);
    }

    @Override
    public void menu() {
        System.out.println("Select an option from below: \n" +
                            " 1. Upload mark. \n" +
                            " 2. Leave.");
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Uploading mark.");
                uploadMark();
                break;
            case 2:
                System.out.println("Goodbye!");
                return;
            default:
                System.out.println("Not a valid option. Try again.");
                break;
        }
        menu();
    }
}
