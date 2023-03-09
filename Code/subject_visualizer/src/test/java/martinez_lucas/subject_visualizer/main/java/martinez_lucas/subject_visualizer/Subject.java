package martinez_lucas.subject_visualizer;

import lombok.*;

import java.util.ArrayList;

@Getter
public class Subject {
    private String name;
    private Professor professor;
    private double mark;
    private ArrayList<Student> students;

    Subject(String name, Professor professor){
        this.name = name;
        this.professor = professor;
        this.mark = 0;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void setMark(double mark, Professor professor) {
        if(professor.equals(getProfessor()))
            this.mark = mark;
        else
            System.out.println("You are not the professor. You can't modify this mark.");
    }

    @Override
    public boolean equals(Object o){
        return ((Subject)o).getName().equals(this.getName()) && ((Subject)o).getProfessor().equals(this.getProfessor());
    }

    @Override
    public String toString(){
        return "Subject: " + getName() + "; \n\tProfessor: " + getProfessor().getName() + ";\n\tMark: " + getMark() + ";\n";
    }
}
