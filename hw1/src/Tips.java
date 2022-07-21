import java.util.Scanner;

/**
 * A program that reads the subtotal and the gratuity rate,
 * then computes the gratuity and total.
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate,
 * the program displays $1.5 as gratuity and $11.5 as total
 *
 * @author Aurona Liu
 * ID:114138778
 */
public class Tips {
    public static void main(String[] args) {
        double subtotal, gratuityRate, gratuity, total;
        System.out.println("Please enter subtotal:");
        Scanner input =new Scanner(System.in);
        subtotal= input.nextDouble();
        System.out.println("Please enter gratuity:");
        gratuityRate= input.nextDouble()/100;
        gratuity=subtotal*gratuityRate;
        total=subtotal+gratuity;
        System.out.println("$"+gratuity+" as gratuity and $"+total+" as total");
        input.close();
    }

}
