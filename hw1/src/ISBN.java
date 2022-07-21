import java.util.Scanner;

/**
 * International Standard Book Number (ISBN) consists of 10 digits.
 * d1d2d3d4d5d6d7d8d9d10.
 * The last digit d10 is a checksum, which is calculated from the other
 * nine digits using the following formula:
 * (d1 x 1 + d2 x 2 + d3 x 3+ d4 x 4 + d5 x 5 + d6 x 6 + d7 x 7 + d8 x 8 + d9 x 9) % 11
 *
 * This is a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including
 * leading zeros).
 *
 * @author Aurona Liu
 * ID:114138778
 *
 */
public class ISBN {
    private static int d;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 9 digits:");
        int isbn= input.nextInt();
        // int 123
        // 123%10=3
        // 123/10 = 12
        String ISBN = String.valueOf(isbn);
        input.close();

        if(ISBN.length()!=9){
            for (int i=ISBN.length(); i<9; i++){//the number of 0 is  9-ISBN.length() or count ISBN.length() to 8
                ISBN="0"+ISBN;
            }
        }
        // sample: 013601267 ->0136012671
        // sample: 12345     ->0000123455
        String d10 ; int dNew=0;
        for (int i=0; i<ISBN.length(); i++){
            int d= ISBN.charAt(i) -'0'; // char 0 = int 48
            dNew= dNew+d*(i+1);
        }

        d10=String.valueOf(dNew % 11) ;
        //If the checksum(d10) is 10, the last digit is denoted X according to the ISBN convention.
        if(dNew==10) ISBN=ISBN+"X";
        else ISBN=ISBN+d10;
        System.out.println("The correct ISBN number is "+ISBN);
     }
}
