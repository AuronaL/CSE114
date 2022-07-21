/**
 * Timing execution
 *  Write a program that randomly generates an array of 1000000
 *  * positive integers from 1 to upRange. The random generation should be the result
 *  * of a method:
 *
 *  @author Aurona Liu
 *  ID:114138778
 */
public class random {
    public static void main(String[] args) {
        //generate an array
        int[] array = random(10,1000000);
        // perform the task;
        long startTime = System.nanoTime();
        linearSearch(array,10);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Linear Search  :"+executionTime);

        selectionSort(array);//do sort before start time
        startTime = System.nanoTime();
        binarySearch(array,10);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Binary Search  :"+executionTime);



    }
    /** Write a program that randomly generates an array of 1000000
     * positive integers from 1 to upRange. The random generation should be the result
     * of a method: **/
    public static int [] random(int aize, int upRange){
        int [] data = new int[aize];
        for (int i = 0; i < aize; i++){
            data [i] = (int)(Math.random()*upRange);}
        return data;
    }
    /** Use linear search to find the key in the list */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++)
            if (key == list[i])
                return i;
        return -1;
    }


    /** Use binary search to find the key in the list */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        int mid;
        while (high >= low) {
            mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1 - low;
    }

    /** A selectionSort method for sorting numbers */
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
