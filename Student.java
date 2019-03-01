package nielwarnproj01;

import java.text.DecimalFormat; // Used to format number of decimals in GPA calc
import java.util.InputMismatchException;

/*
    The Student class inherits from the Person class with
    name and id, Student is created with inherited data fields
    and methods and also Student specific data fields for
    number of credits and total grade points.
    It has getters and setters for the data and a method to calculate
    and return the gpa.
*/
public class Student extends Person {
    // Data fields specific to Student
    private int numOfCredits_;
    private int totalGradePoints_;

    // Constructor to initialize Student properties
    public Student(String name) {
        super(name);

        // Initialize data fields on creation of student
        numOfCredits_ = 0;
        totalGradePoints_ = 0;
    }

    // Method to return student's number of credits
    public int getNumOfCredits() {
        return numOfCredits_;
    }

    // Method to return student's total grade points
    public int getTotalGradePoints() {
        return totalGradePoints_;
    }

    // Method to set student's number of credits
    public void setNumOfCredits(int creditsTotal) {
        numOfCredits_ = creditsTotal;
    }

    // Method to set student's number of credits
    public void setTotalGradePoints(int gradePoints) {
        totalGradePoints_ = gradePoints;
    }

    // Calculate GPA and return it as a String because of the formatter used converts to String
    public String getCalculatedGPA() {
        double gpa = ((double) totalGradePoints_/numOfCredits_); // force totalGradePoints to be double in this division

        // Using DecimalFormat Class to make decimals show only two decimal digits
        DecimalFormat gpaFormat = new DecimalFormat("#.00");
        return gpaFormat.format(gpa); // this format() method converts field to String
    }
}
