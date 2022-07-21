import java.util.Scanner;

/**
 * Write a program that will read a line of text
 *  and output a list of all the letters that occur
 *  in the text together with the number of times each letter occurs in the line.
 *  You may assume that the line contains only lowercase letters and spaces (no digits, punctuation, or other symbols).
 *  You may ignore spaces.
 *
 *  @author Aurona Liu
 *  ID:114138778
 */
public class substituteLetter {
    static int[] counter = new int[26]; // 26 letters

    // count the letters and print the results
    public static void countLetters (String input) {
        for(int i=0; i<input.length(); i++){
            char ch= input.charAt(i);
            if (ch!=' ') counter[ch-'a']++;
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input a string");
        String string = in.nextLine();
        countLetters(string);
        System.out.println("Letter   Number of Occurrences");
        for(int i=0; i<26; i++){
        if(counter[i]!=0) System.out.printf(" %-9s"+counter[i]+"\n", (char)(i+'a'));}
    }
}
