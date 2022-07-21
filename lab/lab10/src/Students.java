import java.util.Scanner;

/**
 *  Define a student class that stores name, score on test 1, and
 * 	  score on test 2.  Methods prompt for and read in grades,
 * 	  compute the average, and print student's name.
 *
 *    @author Aurona Liu
 *    ID:114138778
 */
public class Students {
    //declare instance data
    private int test1 = 0;
    private int test2 = 0;
    private String name;

    //constructor
    public Students(String studentName)
    {
        name=studentName;
    }

    public Students(String studentName, int score1, int score2){
        name=studentName;
        test1=score1;
        test2=score2;
    }

    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    public void inputGrades()
    {
        boolean correct = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter's Joe's score for test1 ");
        do{
            test1 = input.nextInt();
            if (test1<=100 && test1>=0) correct = true;
            else System.out.println("Please input numbers between 0 and 100 :");
        }while(!correct);
        correct = false;
        System.out.println("Enter's Joe's score for test2 ");
        do{
            test2 = input.nextInt();
            if (test2<=100 && test2>=0) correct = true;
            else System.out.println("Please input numbers between 0 and 100 :");
        }while(!correct);
    }

    //getAverage: compute and return the student's test average

    public int getAverage()
    {
        return (test1+test2)/2;
    }

    //printName: print the student's name
    public String printName()
    {
        return name;
    }

    //toString() method
    // When an object is printed, Java looks for a toString method for that object.
    // This method must have no parameters and must return a String.
    // If such a method has been defined for this object, it is called and the string it returns is printed.
    // Otherwise the default toString method, which is inherited from the Object class, is called;
    // it simply returns a unique hexadecimal identifier for the object such as the ones you saw above.
    public String toString(){
        return "Name: "+name+"  Test1: "+test1+"  Test2: "+test2 ;
    }

}
