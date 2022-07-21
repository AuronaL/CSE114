/**
 Write a program that randomly fills in 0s and 1s into an 8 x 8 checkerboard, prints
 the board, and finds the rows, columns, or diagonals with all 0s or 1s. Use a two dimensional
 array to represent a checkerboard. Refer to slide #17 in L08 (Multi-dimensional arrays).
 *  @author Aurona Liu
 *  ID:114138778
 */
public class find1sand0s {
    public static void main(String[] args) {
        //generate a series of 0 and 1s
        int[][] matrix = new int[8][8];

        // for test : read the matrix
//        java.util.Scanner input = new java.util.Scanner(System.in);
//        for (int row = 0; row < 8; row++) {
//            for (int column = 0; column < 8; column++) {
//                matrix[row][column] = input.nextInt();
//            }
//        }

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
             matrix[i][j] = (int)Math.round(Math.random());
            // Math.round(Math.random()) provides long type
            // so (int) is important!!!!!

        //print the matrix
        System.out.println("This matrix is: ");
        for(int row=0; row<matrix.length; row++){
            for(int column = 0; column<matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            // new line after each row
            System.out.println();
        }
        System.out.println();
        boolean is0s=false, is1s=false;
        // check diagonal (or count and the total should be 0 or 8)
        //diagonal
        for (int i=0; i< matrix.length; i++){
            if(matrix[i][i]==0) is0s=true;
            if (matrix[i][i]==1) is1s=true;
        }
        if(is1s & !is0s ) System.out.println("All 1's on the diagonal");
        if(!is1s & is0s ) System.out.println("All 0's on the diagonal");
        is0s=false; is1s=false;

        //minor diagonal i+j=8
        for (int i=0; i< matrix.length; i++){
            if(matrix[i][8-i-1]==0) is0s=true;
            if (matrix[i][8-i-1]==1) is1s=true;
        }
        if(is1s & !is0s ) System.out.println("All 1's on the minor diagonal");
        if(!is1s & is0s ) System.out.println("All 0's on the minor diagonal");
        is0s=false; is1s=false;
        // check rows
        for (int i=0; i< matrix.length; i++){
            for (int j=0; j< matrix[0].length; j++){
                if(matrix[i][j]==0) is0s=true;
                if (matrix[i][j]==1) is1s=true;}
            if(is1s & !is0s ) System.out.println("All 1's on row "+i);
            if(!is1s & is0s ) System.out.println("All 0's on row "+i);
            is0s=false; is1s=false;
        }
        //check columns
        for (int i=0; i< matrix[0].length; i++){
            for (int j=0; j< matrix.length; j++){
            if(matrix[j][i]==0) is0s=true;
            if (matrix[j][i]==1) is1s=true;}
            if(is1s & !is0s ) System.out.println("All 1's on column "+i);
            if(!is1s & is0s ) System.out.println("All 0's on column "+i);
            is0s=false; is1s=false;
        }
    }

}
