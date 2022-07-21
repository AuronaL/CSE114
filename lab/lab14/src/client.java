import java.util.Scanner;
/**
 Write an abstract superclass encapsulating a vehicle: A vehicle has two attributes: its owner's
 name and its number of wheels. This class has two non-abstract subclasses: one encapsulating a
 bicycle, and the other encapsulating a motorized vehicle. A motorized vehicle has the following
 additional attributes: its engine volume displacement, in liters; and a method computing and
 returning a measure of horsepower- the number of liters times the number of wheels. You also
 need to include a client class to test these classes.

 *   @author Aurona Liu
 *   ID:114138778
 */
public class client {
    public static void main(String[] args) {
        //create a motorized vehicle
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the owner name for motorized vehicle");
        String name = n.nextLine();
        System.out.println("Enter the number of wheels:");
        int number = Integer.parseInt(n.nextLine());
        System.out.println("Enter the volume displacement for this vehicle");
        double volume = Double.parseDouble(n.nextLine());
        Motorized_vehicle motorizedVehicle = new Motorized_vehicle(name,number,volume);
        System.out.println(motorizedVehicle+"\nThe horse power is "+motorizedVehicle.horsepower()+"\n");

        //create a bicycle
        System.out.println("Create a default bicycle\nNow create another bicycle");
        Bicycle B1 = new Bicycle();
        System.out.println("Enter the owner name for bicycle");
        String bName = n.nextLine();
        System.out.println("Enter the number of wheels of bicycle:");
        int bNumber = Integer.parseInt(n.nextLine());
        Bicycle B2 = new Bicycle(bName,bNumber);
        System.out.println("Default b1 "+B1+"\nNew bike B2: "+B2);
    }

}
