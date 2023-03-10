package martinez_lucas.subject_visualizer;

import java.util.ArrayList;

public class UniversitySystem {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Subject> subjects = new ArrayList<>();

    public void start(){
        uploadBD();

        LOGGER.login(users);
    }

    private void uploadBD(){
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
                US_FUNCTIONS.addSubjectStudent(((Student)u).getSubjects(),subjects.get(0),((Student)u));
                US_FUNCTIONS.addSubjectStudent(((Student)u).getSubjects(),subjects.get(1),((Student)u));
                US_FUNCTIONS.addSubjectStudent(((Student)u).getSubjects(),subjects.get(2),((Student)u));
                if(u.getUsername().endsWith("2") || u.getUsername().endsWith("4")){
                    US_FUNCTIONS.addSubjectStudent(((Student)u).getSubjects(),subjects.get(3),((Student)u));
                    US_FUNCTIONS.addSubjectStudent(((Student)u).getSubjects(),subjects.get(4),((Student)u));
                }
            }
        }
    }

    private void addUser(User user){
        users.add(user);
    }

    private void removeUser(User user){
        users.remove(user);
    }

    private void addSubject(String name, Professor professor){
        Subject subject = new Subject(name,professor);
        US_FUNCTIONS.addSubjectProfessor(professor.getSubjects(),subject);
        subjects.add(subject);
    }
}
