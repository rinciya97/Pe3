package com.stackroute.pe3;
import java.util.*;

public class StudentMarks {
    private final int LOWEST_GRADE  = 0;
    private final int HIGHEST_GRADE = 100;

    // student's grades
    private int[]  stuGrades;

    private Scanner numOfStudents;


    public static void main(String[] args)
    {
        StudentMarks stud = new StudentMarks();
        stud.numOfStudents = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = stud.numOfStudents.nextInt();

        stud.run(numStudents);
    }

    private void run(int numStudents)
    {
        if (numStudents <= 0) {
            System.out.println("Please enter proper input.");
            return;
        }
        stuGrades= new int[numStudents];

        double sum = 0;
        int    i   = 0;
        while (i < numStudents)
        {
            System.out.printf("Enter the grade for student %d: ", (i+1));
            int grade = numOfStudents.nextInt();

            // chek if grade is between 0 and 100
            if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE)) {
                stuGrades[i] = grade;
                sum      += grade;
                i++;
                continue;
            }
            System.out.println("Invalid grade, try again...");
        }

    }

}
