import java.util.Arrays;
import java.util.Scanner;

/**
 * Write the following method that takes in two arrays of
 * integers. Create and return a new array by interleaving the array together. Once an array is
 * empty, use all the elements from the remaining array.
 *
 *  @author Aurona Liu
 *  ID:114138778
 */
public class InterleaveArrays {
    /**
     * . Create and return a new array by interleaving the array together.
     * @param array1 array one
     * @param array2 array two
     * @return new array
     */
    public static int[] interleaveArrays(int[] array1, int[] array2){
        int[] newArray = new int[array1.length+array2.length];
        // merge two arrays -> length double
        for(int i=0; i<2*Math.min(array1.length, array2.length) ; i++){
        if(i%2==0) newArray[i]=array1[i/2];
        else newArray[i]=array2[i/2]; }// i/2->array[0]=a1[0] array[1]=a2[1] array[2]=a1[3]

        if(array1.length > array2.length) {
            System.arraycopy(array1, array2.length, newArray, 2 * array2.length, array1.length - array2.length);
           // for(int i=0; i<array1.length-array2.length; i++) newArray[2*array2.length+i]=array1[array2.length+i];
        }
        if(array2.length>array1.length){
            //merge so newArray start from 2*array1.length
            for(int i=0; i<array2.length-array1.length; i++) newArray[2*array1.length+i]=array2[array1.length+i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //first array
        System.out.println("Input the size of first array");int size= in.nextInt();
        int[] a1 = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++)
        {//reading array elements from the user
            a1[i]=in.nextInt();
        }
        //second array
        System.out.println("Input the size of second array"); size= in.nextInt();
        int[] a2 = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++)
        {//reading array elements from the user
            a2[i]=in.nextInt();
        }
        //interleave Array
        System.out.println(Arrays.toString(interleaveArrays(a1,a2)));
//        System.out.println(Arrays.toString(interleaveArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6})));// should return [1, 2, 3, 4, 5, 6]
//        System.out.println(Arrays.toString(interleaveArrays(new int[]{10, 20, 30, 40, 50, 60, 70, 80}, new int[]{2, 4, 6, 8})));// should return [10, 2, 20, 4, 30, 6, 40, 8, 50, 60, 70, 80]
//        System.out.println(Arrays.toString(interleaveArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6, 8, 10})));// should return [1, 2, 3, 4, 5, 6, 8, 10]);
    }
}
