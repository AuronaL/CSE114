import java.util.Scanner;

/**
 * - minutes: the number of minutes a car is driven on a long track
 * - mph: the constant speed of the car, given in miles per hour
 * - mpg: the fuel efficiency of the car, given in miles per gallon
 *
 * The function computes and prints the number of gallons of gasoline consumed by a car driven down a long track over the given time period.
 *
 * Hint: minutes / 60 * mph / mpg
 *
 * @author Aurona Liu
 * ID:114138778
 *
 */
public class T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        double minute = input.nextDouble();
        System.out.println("Enter the constant speed of the car (mph): ");
        double mph = input.nextDouble();
        System.out.println("Enter the fuel efficiency of the car (mpg):");
        double mpg = input.nextDouble();
        double gas = minute / 60 * mph/mpg;
        System.out.println("Consumed gas for the period (in gallons):"+ gas);
    }
}