import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program to input an integer and convert it to hexadecimal.
 * Output each digit on a separate line starting from the rightmost digit.
 * Refer to slide #16 in L01 (Introduction to Programming).
 *
 *  @author Aurona Liu
 *  ID:114138778
 */
public class T2ConvertToHexadecimal {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt(), quotient = number / 16, remainder = number % 16;
        char hex[]={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E','F'};
        while (quotient !=0) {
            System.out.println(hex[remainder]);
            System.out.println(hex[remainder]+2);
            System.out.println((char) ('a'+2));
            remainder = quotient % 16;
            quotient = quotient / 16;
        }

        System.out.println(hex[remainder]+"");
    }
}
