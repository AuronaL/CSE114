import java.util.Scanner;

/**
 *  Write a nested for loop that inputs the number of lines and prints powers of 2
 * as a pyramid pattern shown in the following example. You may assume that the user enters any
 * number of lines up to 13
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines: (up to 13):");
        Scanner input = new Scanner(System.in);
        //first pyramid
        //                  1
        //                1 2 1
        //              1 2 4 2 1
        //            1 2 4 8 4 2 1
        //          1 2 4 8 16 8 4 2 1
        //        1 2 4 8 16 32 16 8 4 2 1
        //      1 2 4 8 16 32 64 32 16 8 4 2 1
        //    1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
        //  1 2 4 8 16 32 64 128 256 128 64 32 16 8 4 2 1

        int line = input.nextInt(), count =1, k=1;
        for (int i=0; i<line; i++){
            for(int j=1; j<=2*(line-i); j++){
                System.out.print(" ");
            }
            while (count<=i*2+1){
                if(count<i+1) {
                    System.out.print(k+" ");
                    k=k*2;
                }else if (count==i+1) System.out.print(k+" ");
                else{
                    k=k/2;
                    System.out.print(k+" ");
                }
                count++;
            }
            k=count=1;
            System.out.println();
        }

        // second pyramid
        // 12345678987654321
        // 234567898765432
        //  3456789876543
        //   45678987654
        //    567898765
        //     6789876
        //      78987
        //       898
        //        9
        for(int count2 =1; count2<=9; count2++){
            int i=count2, indent=count2;
            while ((indent-1)!=0){System.out.print("  "); indent--;}//indent
            while(i!=9+1){System.out.print(i+" "); i++;}
            i-=2;
            while(i!=count2-1){System.out.print(i+" "); i--;}
            System.out.println();
        }

        input.close();
    }
}
