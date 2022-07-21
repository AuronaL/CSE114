/**
 *  Write a program that displays the following two tables side-by-side (note
 *    that 1 kilogram is approximately 2.2 pounds):
 *
 *   @author Aurona Liu
 *   ID:114138778
 *
 */
public class T2 {
    public static void main(String[] args) {
        System.out.println("Kilogram\tPound\t  \tPound2  \tKilogram2");
        for (int kilogram = 1; kilogram <= 199; kilogram += 2) {
            // use kilogram to calculate pound2
            int    pound2= (kilogram -1)/2*5+20;
            // calculate pound and kilogram2
            double pound = kilogram*2.2, kilogram2=pound2/2.2;
            // print kilogram, pound, pound2, kilogram2
            System.out.printf("%-11d %-11.1f %-11d %-10.2f \n",
                    kilogram, pound, pound2, kilogram2);

        }

//        Note: Negative width (e.g. %-8d) is to justify left and
//        positive width (e.g. %8d) is to justify right.
//        You can try positive width and see the effect.
    }
}
