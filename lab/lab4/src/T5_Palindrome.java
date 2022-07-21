import java.util.Scanner;

/**
 *  Display a String given by the user reversed. You may use the following
 *
 *   @author Aurona Liu
 *   ID:114138778
 *
 */
public class T5_Palindrome {
    public static void main(String[] args) {
        // input a string
        System.out.println("Enter a string:");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        //determine if it's a Palindrome.
        boolean isPalindrome = true;
        for(int i=0; i<string.length()/2; i++){
            if(string.charAt(i)!=string.charAt(string.length()-1-i))
                isPalindrome = false; break;
        }
        if (isPalindrome) System.out.println("It's a Palindrome.");
        else  System.out.println("It is not a Palindrome.");
    }
}
