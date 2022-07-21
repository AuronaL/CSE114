import java.util.Scanner;

/**
 * A program that the following information and prints a payroll statement:
 * Employee's name (e.g., Smith) Number of hours worked in a week (e.g., 10)
 * Hourly pay rate (e.g., 15.75) Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%). T
 * The program prints the gross and net pay for the employee and payed taxes.
 *
 * @author Aurona Liu
 * ID:114138778
 */
public class Payroll {
    public static void main(String[] args) {
        String name;
        double workHour, hourlyPayRate, federalTaxRate,stateTaxRate, total;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Employee's name: ");
        name=input.nextLine();
        System.out.println("Please enter Number of hours worked in a week:");
        workHour= input.nextDouble();
        System.out.println("Please enter Hourly pay rate ");
        hourlyPayRate= input.nextDouble();
        System.out.println("Please enter Federal tax withholding rate:");
        federalTaxRate = input.nextDouble() /100;
        System.out.println("Please enter State tax withholding rate:");
        stateTaxRate = input.nextDouble()/100;

        input.close();
        total=workHour * hourlyPayRate *(federalTaxRate + stateTaxRate);
        System.out.println("The gross "+ workHour* hourlyPayRate
                + " and net pay "+(workHour* hourlyPayRate-total)+" for "+name+ " and payed taxes "+total+ "."); // (-)
    }
}
