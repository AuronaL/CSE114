import java.util.Scanner;

/**
 *  (Counting positive and negative numbers and computing the average of numbers)
 *  Write a program that reads an unspecified number of integers,
 *  determines how many positive and negative values have been read
 *  computes the total and average of the input values, not counting zeros.
 * (Your program ends with the input 0.)
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class T3 {
    public static void main(String[] args) {
        int total     = 0;
        int countOdd  = 0;
        int countEven = 0;
        // input number
        System.out.println("Please input numbers ended by 0:");
        Scanner input = new Scanner(System.in);
        int number= input.nextInt();
        while (number != 0) {
            // add number to total
            total+=number;
            // if number is even increment countEven otherwise increment countOdd
            if (number%2==0) countEven++;
            else countOdd++;
            // input number
            number=input.nextInt();
        }
        // calculate average (make sure it's a double division)
        double average = (double) total/(countEven+countOdd);//must cast double type otherwise int type
        // print the results
        System.out.print("\tOdd numbers:  "+countOdd+"\n"+
                "\tEven numbers: " +countEven+"\n"+
                "\tTotal: " +total+"\n");
        System.out.printf("\tAverage: %.2f",average);
    }
}
