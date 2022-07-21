import java.util.Scanner;

/**
 Write a program that reads in ten numbers and displays distinct numbers
 (i.e. if a number appears multiple times, it is displayed only once).
 *
 *  @author Aurona Liu
 *  ID:114138778
 */
public class linearSearch {
    /**
     * Use linear search to find the key in the list
     * search the first "count" elements only
     * and return its index if found, otherwise return -1.
     */
    public static int linearSearch(int[] list, int key, int counter) {
        for (int i = 0; i < counter; i++)
            if (key == list[i])
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] distinctArray= new int[10]; int num, counter = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int i=0; i<10; i++){
            num= in.nextInt();
        //distinct number
            if(linearSearch(distinctArray,num,counter)==-1){
                distinctArray[counter]=num;
                counter++;
            }
        }
        System.out.println("Distinct numbers: ");
        //delete all the 0 in the array
            //int[] newArray = new int[targetIndex];
            //System.arraycopy( array, 0, newArray, 0, targetIndex );
        //or print until the counter;
        for (int i=0; i!=counter;i++){
        System.out.println(distinctArray[i]+" ");}
    }

}
