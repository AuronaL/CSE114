import java.util.Locale;
import java.util.Scanner;

/**
 * Write a program that displays a menu where the user selects to make conversions:
 * Refer to the example in L05 slide #24 (Loops lecture material). You may use a nested
 * if-else or a switch statement.
 *
 *  @author Aurona Liu
 *  ID:114138778
 */
public class T3Menu {
    public static double poundsToKilos(double pounds) {return pounds*0.45359237;}

    public static double kilosToPounds(double kilos) {return kilos*2.20462262;}
    public static double kmToM(double kilometers) {return kilometers*0.62137119;}
    public static double mToKm(double miles) {return miles*1.609344;}
    public static void main(String[] args) {
        System.out.println("\tA - convert pounds to kilos\n" +
                "\tB - convert kilos to pounds\n" +
                "\tC - convert kilometers to miles\n" +
                "\tD - convert miles to kilometers\n" +
                "\tE - Exit\n" +
                "Enter your option:");
        Scanner input = new Scanner(System.in);
        String option = input.next().toLowerCase(Locale.ROOT);
        while (!option.equals("e")) {
            switch (option) {
                case "a":
                    System.out.println("Enter a quantity in pounds:");
                    double pounds = input.nextDouble();
                    System.out.println(pounds+" pounds is "+poundsToKilos(pounds)+" kgs");
                    break;
                case "b":
                    System.out.println("Enter a quantity in kilos:");
                    double kilos =input.nextDouble();
                    System.out.println(kilos+" kilos is "+kilosToPounds(kilos)+" pounds");
                    break;
                case "c":
                    System.out.println("Enter a quantity in kilometers:");
                    double kilometers= input.nextDouble();
                    System.out.println(kilometers+ " kilometers is "+ kmToM(kilometers));
                    break;
                case "d":
                    System.out.println("Enter a quantity in miles:");
                    double miles = input.nextDouble();
                    System.out.println(miles+ " miles is "+ mToKm(miles));
                    break;
            }
            System.out.println("Enter your option:");
            option=input.next().toLowerCase(Locale.ROOT);
        }
        System.out.println("Goodbye!");
    }
}
