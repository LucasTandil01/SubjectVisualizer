package martinez_lucas.subject_visualizer;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    private User user;
    Menu(User user){
        this.user = user;
    }

    public void displayMenu(){
        if(user.getUsername().startsWith("S_"))
            displayStudentMenu();
        else
            displayProfessorMenu();
    }

    private void displayStudentMenu(){
        System.out.println();
        System.out.println("Select an option from below: \n" +
                "\t1. Enroll in a subject. \n" +
                "\t2. To cancel a subject. \n " +
                "\t3. See subjects. \n" +
                "\t4. Calculate average. \n" +
                "\t5. Leave.");
        int option = sc.nextInt();
        switch (option){
            case 1:
                US_FUNCTIONS.enrollInSubject();
                break;
            case 2:
                US_FUNCTIONS.toCancelSubject();
                break;
            case 3:
                US_FUNCTIONS.seeSubjects(user);
                break;
            case 4:
                System.out.println("Average: " + US_FUNCTIONS.calculateAverage(user.getSubjects()) + ".");
                break;
            case 5:
                System.out.println("Goodbye!");
                return;
            default:
                System.out.println("Not a valid option. Try again.");
                break;
        }
        displayStudentMenu();
    }

    private void displayProfessorMenu(){
        System.out.println("Select an option from below: \n" +
                "\t1. Upload mark. \n" +
                "\t2. Leave.");
        int option = sc.nextInt();
        switch (option){
            case 1:
                US_FUNCTIONS.uploadMark((Professor)user);
                break;
            case 2:
                System.out.println("Goodbye!");
                return;
            default:
                System.out.println("Not a valid option. Try again.");
                break;
        }
        displayProfessorMenu();
    }
}
