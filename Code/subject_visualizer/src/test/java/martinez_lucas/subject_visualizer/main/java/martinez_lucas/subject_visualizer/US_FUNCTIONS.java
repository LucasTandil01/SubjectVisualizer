package martinez_lucas.subject_visualizer;

import java.util.ArrayList;

public final class US_FUNCTIONS {
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

    public static void seeSubjects(ArrayList<Subject> subjects){
        System.out.println(subjects);
    }

    public static void enrollInSubject(){
        System.out.println("Enrolling in a subject...");
    }

    public static void toCancelSubject(){
        System.out.println("Cancelling a subject...");
    }
    public static void addSubject(ArrayList<Subject> subjects, Subject subject, Student student){
        subjects.add(subject);
        subject.addStudent(student);
    }
}
