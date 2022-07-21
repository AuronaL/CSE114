import java.util.Objects;
import java.util.Scanner;

/**
 * (NumberFormatException) Implement a simple calculator with basic four operations: +, -, *, /.
 * It should run as follows:
 *
 * 	Input: 1 + 2
 * 	Result: 3
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class Calculator {
    String str;
    Calculator(Scanner scan){
        str= scan.nextLine();
    }
    public int calculate(String str) throws NumberFormatException{
        String[] str1 = str.split(" ");
        if (!isNumeric(str1[0])|| !isNumeric(str1[2])) throw new NumberFormatException("Invalid operand type\n");
        if(str1[1].equals("/")&& Objects.equals(str1[2], "0")) throw new NumberFormatException("Division by zero is illegal");
        switch (str1[1]){
            case "+":
                return Integer.parseInt(str1[0])+Integer.parseInt(str1[2]);
            case "-":
                return Integer.parseInt(str1[0])-Integer.parseInt(str1[2]);
            case "*":
                return Integer.parseInt(str1[0])*Integer.parseInt(str1[2]);
            case "/":
                return Integer.parseInt(str1[0])/Integer.parseInt(str1[2]);

        }
    return 0;
    }
    public boolean isNumeric(String s){
        for(char ch: s.toCharArray()){
            if(ch<'0'||ch>'9') return false;
        }
        return true;
    }
     class NumberFormatException extends IllegalArgumentException{
        NumberFormatException(String e){
            super(e);
        }
     }
}

