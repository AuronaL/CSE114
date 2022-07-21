import java.util.Arrays;
import java.util.Scanner;

/**
 * Create a Java file named ArrayUtils that has a main program
 * and includes the following methods
 *
 *  @author Aurona Liu
 *  ID:114138778
 */
public class ArrayUtils {
    /**
     * . This method should create an array of the given size and fill it with
     * random numbers between the given range and return the array created as its return value.
     * @param size size
     * @param upperLimit upper limit
     * @return an array
     */
    public static int[] randomArray(int size, int upperLimit){
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i]= (int) (Math.random() * (upperLimit-1));
        }
        return array;
    }

    /**
     * Define a method named print with one parameter of type array of integers,
     * which outputs the elements of the given array to the standard output device, i.e., the computer screen.
     *
     * @param array array of integers
     * @return the standard output device
     */
    public static String print(int[] array){ String print ="";
        //for(int number: array){print+=(char)(number-1+'a');}//int element:list name
        for(int number: array){print+=number+" ";}
        return print;
    }

    /**
     * This method named arraySum with one parameter of type array of integers,
     * which returns the sum of all the elements in the array.
     * @param array array of integers
     * @return s the sum of all the elements in the array
     */
    public static int arraySum(int[] array){ int sum=0;
        for(int number :array){sum+=number;}
        return sum;
    }

    /**
     * The method returns the index of the array where the first occurrence of the target is found, if that
     * number is contained within the array. If the target is not contained in the first array argument, the
     * method returns −1.
     * @param array an array of integers
     * @param target a single integer named target.
     * @return  the index of the array where the first occurrence of the target is found
     */
    public static int contains(int[] array, int target){ int index=-1;
        for(int i=0;i< array.length; i++){
            if(array[i]==target) { index=i; break; }
        }
        return index;
    }

    /**
     * This method returns the count of the integers in the array that are multiples of the second parameter.
     * For example, 8 is a multiple of 2, but not a multiple of 3, and zero is a multiple of any number.
     * @param array an array of integers
     * @param integer an integer
     * @return s the count of the integers in the array that are multiples of the second parameter
     */
    public static int countMultiplesOf(int[] array, int integer){ int count=0;
       for(int num: array) if(num%integer==0) count++;
       return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input array size");int size= in.nextInt();
        System.out.println("Input array upperLimit");int upperLimit= in.nextInt();
        int[] array = randomArray(size,upperLimit);
        System.out.println(print(array));
        System.out.println("The average is "+(double)arraySum(array)/ array.length);
        System.out.println("Inout target: ");int target = in.nextInt();
        System.out.println(contains(array, target));
        System.out.println("Input integer"); int integer = in.nextInt();
        System.out.println(countMultiplesOf(array, integer));
    }
}
