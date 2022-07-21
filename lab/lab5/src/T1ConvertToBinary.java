import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program to input an integer and convert it to binary. Output
 * each digit on a separate line starting from the rightmost digit. Refer
 * to slide #11 in L01 (Introduction to Programming).
 *
 *  @author Aurona Liu
 *  ID:114138778
 */
public class T1ConvertToBinary {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int quotient = number/2;
        int remainder = number%2;
        while (quotient !=0) {
            System.out.println(remainder);
            remainder = quotient%2;
            quotient = quotient/2;
        }
        System.out.println(remainder);
    }
}
