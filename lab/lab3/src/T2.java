import java.util.Scanner;

/**
 * program that asks a user to enter the regular price of a game and number
 * of games purchased.
 *
 * @author Aurona Liu
 * ID:114138778
 */
public class T2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter regular price: ");
        double price = input.nextDouble();
        System.out.println("Enter quantity:");
        double quantity = input.nextDouble();
        // Calculate discount
        double discount = 0.0;
        if (quantity >= 100)
            discount = 0.50;
        else if (quantity >= 50)
            discount = 0.40;
        else if (quantity >= 20)
            discount = 0.30;
        else if (quantity >= 10)
            discount = 0.20;
        System.out.println("Discount: "+discount*100+"%\n"+
                "Discounted price: $"+price*(1-discount)+"\n" +
                "Discounted amount per unit: $"+ price*discount +
                "\n\n" +
                "Total price: $"+price*(1-discount)+" * "+quantity+" = $"+price*(1-discount)*quantity);
    }
}
