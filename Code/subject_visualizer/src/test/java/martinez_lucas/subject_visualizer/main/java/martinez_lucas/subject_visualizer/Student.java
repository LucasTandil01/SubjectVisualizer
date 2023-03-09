package martinez_lucas.subject_visualizer;

import lombok.*;

import java.util.ArrayList;
import java.util.Scanner;

@Getter
public class Student extends User{
    private ArrayList<Subject> subjects;
    Student(String username, String password, String name) {
        super(username, password, name);
        this.subjects = new ArrayList<>();
    }

    private void seeSubjects(){
        System.out.println(subjects);
    }

    private double calculateAverage(){
        if(subjects.size() == 0)
            return 0;
        double total = 0;
        for(Subject s: subjects)
            total += s.getMark();
        return total/subjects.size();
    }

    private void enrollInSubject(){

    }

    private void toCancelSubject(){

    }
    public void addSubject(Subject subject){
        subjects.add(subject);
        subject.addStudent(this);
    }

    @Override
    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Select an option from below: \n" +
                " 1. Enroll in a subject. \n" +
                " 2. See subjects. \n" +
                " 3. Calculate average. \n" +
                " 4. Leave.");
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Enrolling in a subject...");
                enrollInSubject();
                break;
            case 2:
                System.out.println("Seeing subjects...");
                seeSubjects();
                break;
            case 3:
                System.out.println("Calculating average...");
                System.out.println("Average: " + calculateAverage() + ".");
                break;
            case 4:
                System.out.println("Goodbye!");
                return;
            default:
                System.out.println("Not a valid option. Try again.");
                break;
        }
        menu();
    }
}
