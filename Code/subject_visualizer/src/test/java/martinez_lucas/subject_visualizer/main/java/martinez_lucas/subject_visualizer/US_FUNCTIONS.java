package martinez_lucas.subject_visualizer;

import java.util.ArrayList;
import java.util.Scanner;

public final class US_FUNCTIONS {
    static Scanner sc = new Scanner(System.in);
    public static double calculateAverage(ArrayList<Subject> subjects){
        if(subjects.size() == 0)
            return 0;

        double total = 0;
        int count = 0;
        double average = 0;

        for(Subject s: subjects){
            double mark = s.getMark();
            if(mark > 0) {
                total += mark;
                count++;
            }
        }
        if(count > 0)
            average = total/count;

        return average;
    }

    public static void seeSubjects(User user){
        System.out.println(user.getSubjects());
    }

    public static void enrollInSubject(){
        System.out.println("Enrolling in a subject...");
    }

    public static void toCancelSubject(){
        System.out.println("Cancelling a subject...");
    }
    public static void addSubjectStudent(ArrayList<Subject> subjects, Subject subject, Student student){
        subjects.add(subject);
        addStudentToSubject(subject.getStudents(), student);
    }

    public static void uploadMark(Professor professor){
        System.out.println(professor.getSubjects());
        System.out.print("Select position of the subject: ");
        int position = sc.nextInt();
        Subject subject = professor.getSubjects().get(position);

        System.out.println(subject.getStudents());
        System.out.print("Select position of the student: ");
        position = sc.nextInt();
        Student student = subject.getStudents().get(position);

        System.out.print("Which is the mark?: ");
        double mark = sc.nextDouble();

        ArrayList<Subject> student_subjects = student.getSubjects();
        int sub_pos = student_subjects.indexOf(subject);
        student_subjects.get(sub_pos).setMark(mark, professor);
    }

    public static void addSubjectProfessor(ArrayList<Subject> subjects, Subject subject){
        subjects.add(subject);
    }

    public static void removeSubject(ArrayList<Subject> subjects, Subject subject){
        subjects.remove(subject);
    }

    public static void addStudentToSubject(ArrayList<Student> students, Student student){
        students.add(student);
    }

    public static void removeStudentFromSubject(ArrayList<Student> students, Student student){
        students.remove(student);
    }
}
