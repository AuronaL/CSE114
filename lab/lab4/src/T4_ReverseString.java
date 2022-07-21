import java.util.Scanner;

/**
 *  Display a String given by the user reversed. You may use the following
 *
 *   @author Aurona Liu
 *   ID:114138778
 *
 */
public class T4_ReverseString {
    public static void main(String[] args) {
        // input a string
        System.out.println("Enter a string:");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        // set length to the length of the given string
        for (int i = string.length()-1; i >= 0; i--) {
            // print the ith character
            System.out.print(string.charAt(i));
        }

    }
}
