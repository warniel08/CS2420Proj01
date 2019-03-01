/*
 *  Warner Nielsen
 *  1/12/19
 *  CS 2420
 *  Project 01
 *  Garth Sorenson
 */
package nielwarnproj01;

import java.util.Scanner;

/*
    This class contains the main() method. It prompts the user to enter certain data
    and uses both the inherited and Class specific Student Class methods to demonstrate
    that they do what they are supposed to do.
*/
public class NielWarnProj01 {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to Project 01! It creates a Student by inheriting from a Person Class.");
        System.out.println("It will then use each method from the Student class and display its data.");

        Scanner input = new Scanner(System.in); // Create new input scanner

        // Prompt to enter name of students one and two
        System.out.println("\nYou will now enter into the system the name of two different students...");
        System.out.print("Enter the first and last name for student one: ");
        String stu1_name = input.nextLine();
        System.out.print("Enter the first and last name for student two: ");
        String stu2_name = input.nextLine();

        // New students created using names collected from user
        Student stu1 = new Student(stu1_name);
        Student stu2 = new Student(stu2_name);
        Student stu3 = stu2;

        // Student 3 created using Student 2's info
        System.out.println("\nStudent three created based on student two for comparison purposes...");

        // Using toString() method to print each students name and id
        System.out.println("\nSTUDENT OBJECT1: " + stu1.toString());
        System.out.println("STUDENT OBJECT2: " + stu2.toString());
        System.out.println("STUDENT OBJECT3: " + stu3.toString());

        // Using getName() and getID() methods to get each Student's name and id
        System.out.println("\nSTUDENT1 NAME: " + stu1.getName());
        System.out.println("STUDENT1 ID: " + stu1.getID());
        System.out.println("\nSTUDENT2 NAME: " + stu2.getName());
        System.out.println("STUDENT2 ID: " + stu2.getID());
        System.out.println("\nSTUDENT3 NAME: " + stu3.getName());
        System.out.println("STUDENT3 ID: " + stu3.getID());

        // Using the equals() method to compare the students and show student 2 and 3 are the same
        System.out.println("\nStudent Obj1 Equals Student Obj2 Comparison: " + (stu1.equals(stu2)));
        System.out.println("Student Obj2 Equals Student Obj3 Comparison: " + (stu2.equals(stu3)));

        /* Using the setNumOfCredits() method to set the number of credits for each student
           Also, using the helper method intInputValidator() to make sure that a user
           inputs a non-negative integer
        */
        System.out.print("\nPlease enter how many credits " + stu1_name + " has: ");
        int stu1_creds = -1; // set to -1 so that it can properly hit the loop when called
        stu1_creds = intInputValidator(stu1_creds, input); // proper value returned from function overwrites -1
        stu1.setNumOfCredits(stu1_creds);

        System.out.print("Please enter how many credits " + stu2_name + " has: ");
        int stu2_creds = -1;
        stu2_creds = intInputValidator(stu2_creds, input);
        stu2.setNumOfCredits(stu2_creds);

        System.out.print("Please enter how many credits " + stu3.getName() + " has: ");
        int stu3_creds = -1;
        stu3_creds = intInputValidator(stu3_creds, input);
        stu3.setNumOfCredits(stu3_creds);

        // Using the getNumOfCredits() method to return values for each student
        System.out.println("\nSTUDENT1 NUMBER OF CREDITS: " + stu1.getNumOfCredits());
        System.out.println("STUDENT2 NUMBER OF CREDITS: " + stu2.getNumOfCredits());
        System.out.println("STUDENT3 NUMBER OF CREDITS: " + stu3.getNumOfCredits());

        // Using the setTotalGradePoints() method to set the total grade points for each student
        System.out.print("\nPlease enter the number of grade points " + stu1.getName() + " has: ");
        int stu1_gradePoints = -1;
        stu1_gradePoints = intInputValidator(stu1_gradePoints, input);
        stu1.setTotalGradePoints(stu1_gradePoints);

        System.out.print("Please enter the number of grade points " + stu2.getName() + " has: ");
        int stu2_gradePoints = -1;
        stu2_gradePoints = intInputValidator(stu2_gradePoints, input);
        stu2.setTotalGradePoints(stu2_gradePoints);

        System.out.print("Please enter the number of grade points " + stu3.getName() + " has: ");
        int stu3_gradePoints = -1;
        stu3_gradePoints = intInputValidator(stu3_gradePoints, input);
        stu3.setTotalGradePoints(stu3_gradePoints);

        // Using the getTotalGradePoints() method to return the values for each student
        System.out.println("\nSTUDENT1 NUMBER OF GRADE POINTS: " + stu1.getTotalGradePoints());
        System.out.println("STUDENT2 NUMBER OF GRADE POINTS: " + stu2.getTotalGradePoints());
        System.out.println("STUDENT3 NUMBER OF GRADE POINTS: " + stu3.getTotalGradePoints());

        // Using the getCalculatedGPA() method to return the calculated GPA values as doubles with two decimals for each student
        System.out.println("\nSTUDENT1 GPA: " + stu1.getCalculatedGPA());
        System.out.println("STUDENT2 GPA: " + stu2.getCalculatedGPA());
        System.out.println("STUDENT3 GPA: " + stu3.getCalculatedGPA());

        // Close Scanner called input
        input.close();
    }

    /* Helper method to validate the user input for number of credits and total grade points
       The method is static so that it can be used inside the main driver function.
    */
    public static int intInputValidator(int studentCredsOrGP, Scanner intInput) {
        studentCredsOrGP = intInput.nextInt();
        while (studentCredsOrGP < 0) {
            System.out.print("Please enter an integer greater than 0: ");
            studentCredsOrGP = intInput.nextInt();
        }
        return studentCredsOrGP;
    }
}
