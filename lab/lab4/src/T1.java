/**
 * Write a program that displays the following table (note that 1 mile is
 *    approximately 1.609 kilometers).
 *
 * @author Aurona Liu
 * ID:114138778
 *
 */
public class T1 {
    public static void main(String[] args) {
        System.out.println("Miles  Kilometers");
        for (int miles = 1; miles <= 10; miles++) {
            // insert your code here
            double kilometers = miles*1.609;
            System.out.printf("%-8d %.3f\n", miles,kilometers);
        }
    }

}
