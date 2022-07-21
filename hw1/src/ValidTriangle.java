import java.util.Scanner;

/**
 *a program that reads three edges for a triangle
 * and determines whether the input is valid.
 *
 * The input is valid
 * if the sum of any two edges is greater than the third edge.
 *
 * @author Aurona Liu
 * ID:114138778
 *
 */
public class ValidTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edge1, edge2, edge3;
        System.out.println("Please enter one edge:");
        edge1= input.nextInt();
        System.out.println("Please enter another edge:");
        edge2= input.nextInt();
        System.out.println("Please enter the last edge:");
        edge3= input.nextInt();
        if(edge1==0||edge2==0||edge3==0) System.out.println("Not valid because the edge should not be 0.");
        if((edge1+edge2)>edge3 && (edge1+edge3)>edge2 && edge1<(edge2+edge3)) System.out.println("Yes! The input is valid.");
        else System.out.println("Oops, the input is invalid.");
        input.close();
    }
}
