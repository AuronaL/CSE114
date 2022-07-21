import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that reads in ten numbers and displays
 * distinct numbers
 *
 *  @author Aurona Liu
 *  ID:114138778
 */
public class distinctNumbers {
    //Hint: Read a number and store it to an array if it is new. If the number is already in
    //the array, discard it. After the input, the array contains the distinct numbers. Keep a
    //counter of the unique numbers.
    public static void main(String[] args) {
        int count=0, unique=0; ArrayList<Integer> array = new ArrayList<>();
        while (count!=10){
            count++;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (!array.contains(number)){array.add(number); unique++;}
        }
        System.out.println("This distinct array is "+array+"\n There are "+unique+" unique numbers");
    }
}
