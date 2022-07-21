import java.util.Objects;
import java.util.Scanner;

/**
 * Write a method to multiply two matrices
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class TicTacToe {
    public static final int GRID_SIZE = 3;
    public static String[][] grid= new String[GRID_SIZE][GRID_SIZE];
    public static String[] status ={ "unfinished", "win" ,"draw" };
    public static int indexStatus = 0;
    /**
     *prints the matrix
     */
    public static void print(){
        for (int i=0; i<GRID_SIZE; i++){
            for (int j=0; j<GRID_SIZE ;j++){
                System.out.printf("%-8s", grid[i][j]);
            }
            System.out.println();
            }
    }

    /**
     * This method decides whether a winner appers
     * @return index of status
     */
   public static int decideCurrentStatus(){
        int count=0, i=0;
       while(i<GRID_SIZE && indexStatus==0 ){
           // row
            for(int j=0; j< GRID_SIZE; j++){
                if(Objects.equals(grid[i][j], "X")) count++;
                else if(Objects.equals(grid[i][j], "O")) count--;
            }
            if (count==3) {
                System.out.println("The first player wins.");
                return 1;
            }
            else if (count==-3) {
                System.out.println("The second player wins");
                return  1;
            }
            count=0;

            //column
           for(int j=0; j< GRID_SIZE; j++){
               if(Objects.equals(grid[j][i], "X")) count++;
               else if(Objects.equals(grid[j][i], "O")) count--;
           }
           if (count==3) {
               System.out.println("The first player wins.");
               return  1;
           }
           else if (count==-3) {
               System.out.println("The second player wins");
               return 1;
           }
           count=0;
           i++;
        } i=0;

       //diagonal
       while(i<GRID_SIZE && indexStatus==0){
           if(Objects.equals(grid[i][i], "X")) count++;
           else if(Objects.equals(grid[i][i], "O")) count--;
           i++;}
       if (count==3) {
           System.out.println("The first player wins.");
           return  1;
       }
       else if (count==-3) {
           System.out.println("The second player wins");
           return 1;
       }
       count=0;i=0;

       //minor diagonal
       while(i<GRID_SIZE && indexStatus==0){
           if(Objects.equals(grid[i][GRID_SIZE-i-1], "X")) count++;
           else if(Objects.equals(grid[i][GRID_SIZE-i-1], "O")) count--;
           i++;}
       if (count==3) {
           System.out.println("The first player wins.");
           return 1;
       }
       else if (count==-3) {
           System.out.println("The second player wins");
           return  1;
       }
       return 0;
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        do{
            boolean placed = false;
            while(! placed){
                System.out.println("For the first player, please enter the row (0~2):");
                int fRow= in.nextInt();
                System.out.println("For the first player, please enter the column (0~2):");
                int fColumn= in.nextInt();
                in.nextLine();
                if (grid[fRow][fColumn]==null) {
                    grid[fRow][fColumn]="X";
                    placed=true;
                    count++;
                }
                else System.out.println("Sorry this position has a token. Please try again:");
                print();
            }
            placed=false;

            if(count>=3) indexStatus= decideCurrentStatus();
            if(indexStatus==1 || count >= 9) break;
            while(! placed){
                System.out.println("For the second player, please enter the row (0~2):");
                int sRow= in.nextInt();
                System.out.println("For the second player, please enter the column (0~2):");
                int sColumn= in.nextInt();
                in.nextLine();
                if (grid[sRow][sColumn]==null) {
                    grid[sRow][sColumn]="O";
                    count++;
                    placed=true;
                }
                else System.out.println("Sorry this position has a token");

                print();
                System.out.println();
            }
            if(count>=3) indexStatus= decideCurrentStatus();
        }while (count<9 && indexStatus!=1);
        // indexStatus=2;
        if(count==9 && indexStatus != 1) System.out.println("Draw. Now the grid is filled, please start again.");
    }
}