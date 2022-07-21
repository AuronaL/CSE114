import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a method to multiply two matrices
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class MultiplyMatrices {
    //print the matrix
    public static void print(double[][] matrix){
        for(int row=0; row<matrix.length; row++){
            for(int column = 0; column<matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            // new line after each row
            System.out.println();
        }}
    // Let c be the
    // result of the multiplication.
    // Each element cij is ai1 x b1j + ai2 x b2j +…+ ain x bnj
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] c = new double[a.length][b[0].length];
        // c[i][j]    c.length()-> i; c[0].length -> j;
        //int[][] array = {
        // {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}
        //array.length? 4 //array[0].length? 3 //array[1].length? 3
        for(int i =0; i< a.length; i++ ){
            for (int j=0; j<b[0].length; j++){
                int n=0; // n start from 0 so there is no a[3][3] only a[2][2]
                while (n<a[0].length){
                    c[i][j]+=a[i][n]*b[n][j] ; n++;
                }
            }
        }
        return c;
    }
    //Write a test program that prompts the user to enter two 3 x 3 matrices and displays their product
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        System.out.println("Please enter two 3 x 3 matrices.\ninput the first matrix:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j]= in.nextDouble();
            }
        }
        in.nextLine();
        System.out.println("input the second matrix:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                b[i][j]= in.nextDouble();
            }
        }
        in.nextLine();
        in.close();
        System.out.println("The first matrix is ");
        print(a);
        System.out.println("\nThe second matrix is ");
        print(b);
        System.out.println("\nThe multiplication product is ");
        print(multiplyMatrix(a,b));
    }
}
