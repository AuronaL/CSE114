/**
 * Define a custom exception called HexFormatException that extends java.lang.NumberFormatException.
 * Implement a parseHex method that transforms from hexadecimal to decimal method and throws a HexFormatException if the string is NOT a hex string.
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
import java.util.Scanner;

class HexFormatException extends NumberFormatException {
    HexFormatException(String str){
        super(str);
    }
}
public class InputHexFormatExceptionDemo{

    //transforms from hexadecimal to decimal method and throws a HexFormatException if the string is NOT a hex string.
    public static int parseHex(String hex){
        if (!isHex(hex)) throw new HexFormatException("Wrong hex format");
        return Integer.parseInt(hex,16);
    }

    //check whether a string is a hex str
    public static boolean isHex(String hex){
        if (hex.length()==0) return false;
        for (char ch: hex.toCharArray()){
            // 0~9 or A~E
            if ((ch<'0'||ch > '9')&&(ch>'F' ||ch<'A')){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an hex string: ");
        try{
           String str = in.nextLine();
            System.out.println("Decimal value is : " + parseHex(str));
        } catch (HexFormatException E){
            System.out.println("This string is not a hex string.");
        }
    }
}