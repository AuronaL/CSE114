import java.util.ArrayList;
import java.util.Scanner;

/**
 *Write the following method that returns a copy of the
 * argument str after eliminating all duplicate characters
 *  @author Aurona Liu
 *  ID:114138778
 */
public class EliminateDuplicates {
    // The first occurrence of each character must be kept and the characters must stay in order relative to the other letters in the string:
    public static String eliminateDuplicates(String str){
        ArrayList<String> print = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            if (!print.contains(String.valueOf(str.charAt(i)))){
            print.add(String.valueOf(str.charAt(i)));
        }
        } String output ="";
        for (String k: print){ output=output+k;}
        return output;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string");
        String string= in.nextLine();
        System.out.println(eliminateDuplicates(string));
        //test
//        System.out.println( eliminateDuplicates("abracadabra")) ; //should return abrcd
//        System.out.println( eliminateDuplicates("Stony Brook University"));; // should return Stony BrkUives
//        System.out.println( eliminateDuplicates("This is a test sentence."));; // should return This atenc.
    }
}