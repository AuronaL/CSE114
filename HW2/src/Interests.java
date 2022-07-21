import java.util.Scanner;

/**
 *  Write a program that lets the user enter the loan amount and loan period in
 *  number of years and displays the monthly and total payments for each annual interest rate
 *  starting from 5% to 8%, with an increment of 1/8.
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class Interests {
    public static void main(String[] args) {
        System.out.println("Loan amount:");
        Scanner input = new Scanner(System.in);
        double loanAmount = input.nextDouble();
        System.out.println("Number of years:");
        int year = input.nextInt();
        double rate = 5;
        System.out.println("Interest Rate     Monthly Payment     Total Payment");
        while (rate<=8){
            double monthlyInterestRate = rate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), year * 12)));
            double totalPayment = monthlyPayment * year * 12;
            //%d int; %f flow
            System.out.printf("%.3f%-15s %-15.2f %-15.2f\n",rate,"%", monthlyPayment,totalPayment );
            rate=0.125+rate;
        }
    }
}
