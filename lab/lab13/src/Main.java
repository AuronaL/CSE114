import java.util.Scanner;

public class Main {
    //q1
    //Write a method to compute the factorial of an integer n using iteration (n! = 1 * 2 * ... * n)
    //and test it. Note that you should use a long to store the computed result, and return a long
    //(due to possible overflow issues past 13!)
    public static long factorial(int n){
        long nf=1;
        for (int i=1; i<=n; i++){
            nf*=i;
        }
        return nf;
    }
    //q2
    //Write a recursive method to compute the following series:
    //	m(i) = 1 + 1/2 + 1/3 + ... + 1/i
    //Write a test program that displays the value of m(i) for values of i between 1 and 10 (inclusive).
    public static double m(double i){
        if (i==1)
            return i; //base
        else
            return m(i-1)+1/i;
    }
    //q3
    //Write a recursive method that recursively adds up the digits in an integer. Use the following header: public static int sumDigits(long n)
    //For example, sumDigits(234) would return 9 (because 2+3+4 = 9). Write a test program that reads
    //in a number from the user and prints the sum of its digits.
    public static int sumDigits(long n){
        int sum =0;
        sum += n % 10;
        if (n==0)
            return sum;
        else {
            return sum + sumDigits(n / 10);
        }
    }
    //q4
    // Write a recursive method that takes an integer argument and prints the digits of that integer in reverse order on the console.
    // For example, given the input 12345, the method would print out54321.
    // Use the following method header: public static void reverseDisplay (int value)
    public static void reverseDisplay (int value){
        if (value==0) System.out.println();
        else{
            System.out.print(value%10);
            reverseDisplay(value/10);
        }
    }
    //q5
    //Write a recursive method that computes and returns the reverse of an integer (the reverse of
    //an integer is a new integer that contains all the digits of the original, but in reverse order).
    //For example, reverse(12345) returns 54321.
    static int val=0;
    public static int reverseInteger (int value){
        if (value==0) {
            return val;
        }
        if (value > 0){
            int temp = value % 10;
            val= val*10 +temp;
            reverseInteger(value/10);
        }
        return val;
    }

    //test
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //q1
        System.out.println("Input an non-negative integer: ");
        int n = input.nextInt();
        System.out.println(factorial(n));
        //q2
        System.out.println("Input an non-negative integer: (1-10)");
        int i = input.nextInt();
        while(i<1||i>10){
            System.out.println("Please try again!");
            i=input.nextInt();
        }
        System.out.println(i+"  "+m(i));
        //q3
        System.out.println("Input an non-negative integer: ");
        n = input.nextInt();
        System.out.println(sumDigits(n));
        //q4
        System.out.println("Input an non-integer: ");
        n = input.nextInt();
        reverseDisplay(n);
        //q5
        System.out.println("Input an non-negative integer: ");
        n = input.nextInt();
        System.out.println(reverseInteger(n));

    }
}