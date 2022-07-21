import java.util.Scanner;
public class switchUsage {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("enter an integer: 1, 2, 3 or 4");
        int x = stdin.nextInt();
        switch(x){
        case 1:
        System.out.println("Freshman");
        break;
        case 2:
        System.out.println("Sophomore");
        break;
        case 3:
        System.out.println("Junior");
        break;
        case 4:
        System.out.println("Senior");
        break;
        default:
        System.out.println("Imporper input");}
        stdin.close();}}

