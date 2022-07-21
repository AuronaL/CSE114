import java.util.Scanner;

/**
 * Tracking Grades: A teacher wants a program to keep track of grades for students and decides to create a student class for his program as follows:
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class Grades {
    public static void main(String[] args)
    {
        Students student1 = new Students("Mary");
        //create student2, "Mike"
        Students student2 = new Students("Mike");

        //input grades for Mary
        student1.inputGrades();
        //print average for Mary
        System.out.println("The average for "+student1.printName() + " is "+ student1.getAverage()+"\n");

        //input grades for Mike
        student2.inputGrades();
        //print average for Mike
        System.out.println("The average for "+student2.printName() + " is "+ student2.getAverage()+"\n");

        //Now see what happens when you print a student object
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
    }
}