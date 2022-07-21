import java.util.Scanner;
/**
 * Write a test program tesT Triangle & Calculator
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Question1:");
            Triangle T1 = new Triangle(1,1,2);
        }catch (IllegalTriangleException E){
            System.out.println("This triangle is illegal.\n");
        }
        System.out.println("Question2: input 3 times");
        for(int i=0; i<3; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please input an operation in one line and divide them by space:");
            Calculator c = new Calculator(scan);
            try {
                System.out.println(c.calculate(c.str));
            } catch (Calculator.NumberFormatException e) {
                System.out.println(e);
                System.out.println("pLease try again");
            }
        }
    }
}