import java.util.Scanner;

/**
 * *  @author Aurona Liu
 *  *  ID:114138778
 * Compile and run the following program and understand how it works: 
 */
public class SampleClassWitharrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = input.nextInt();

        // create an array with multiples of 10 
        int [] data = multiplesOfTen (size);

        // print the content of the array
        for (int i = 0; i < size; i++)
            System.out.println(data[i]);
    }

    public static int [] multiplesOfTen (int size) {
        int [] data = new int[size];
        for (int i = 0; i < size; i++)
            data [i] = i*10;
        return data;
    }
}