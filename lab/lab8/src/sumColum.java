/**
 * Write a test program  that first prompts the user to enter the dimension n of an n x m matrix,
 * then asks them to enter the matrix row by row (with the elements separated by spaces).
 *  *  @author Aurona Liu
 *  *  ID:114138778
 */
public class sumColum {
    public static int sumColumn(int [][] matrix, int column){
        int sum=0;
        for(int row=0; row<matrix.length; row++)
            sum += matrix[row][column];
        return sum;
    }
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the dimensions of a n x m matrix: ");
        int n= input.nextInt();
        int m = input.nextInt();

        // read the matrix
        int[][] matrix= new int[n][m];
        System.out.println("Enter the matrix of "+n+" x "+m+":");
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < m; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        // print matrix
        System.out.println("This matrix is: ");
        for(int row=0; row<matrix.length; row++){
            for(int column = 0; column<matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
                // new line after each row
            System.out.println();
        }
        //adding elements by column //matrix[0].length-> m (colum)
        System.out.println("The sums of the columns are: ");
        for(int i = 0; i < m ; i++) {
            System.out.print( sumColumn(matrix, i)+" ");
        }
    }
}