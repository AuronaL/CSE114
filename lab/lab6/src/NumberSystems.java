import java.util.ArrayList;

/**
 * Write conversion methods for number systems:
 *  @author Aurona Liu
 *  ID:114138778
 */
public class NumberSystems {
    public static String decimal2hex(int n) {
       return decimal2BaseX(n,16);
    }
    public static String decimal2BaseX(int dec, int base) {
        int quotient=dec, reminder; ArrayList<String> print = new ArrayList<>();String output="";
        while(quotient!=0){
            reminder=quotient%base;
            quotient=quotient/base;
            if(reminder>=10 ){
                //caset char first and then turn into string
                print.add(String.valueOf((char)(reminder + 'A' - 10))); }//numbers:reminder-10+'A'+""
            else print.add(""+reminder);
        }
        for(int i=print.size()-1;i>=0;i--){
            output+=print.get(i);
        }
        return output;
    }
     // base is less than 9

    public static void main(String[] args) {
        System.out.println(decimal2hex(161));      // A1
        System.out.println(decimal2BaseX(6, 2));   // 110
        System.out.println(decimal2BaseX(87, 8));  // 127
    }
}
