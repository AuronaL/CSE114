/**
 Draw the UML diagram for the class using one of the UML tools above. Implement the class. Write a
 test program that creates two Rectangle objects. Assign width 4 and height 40 to the first object
 and width 3.5 and height 35.9 to the second object. Assign color red to all Rectangle objects.
 Display the properties of both objects and find their areas and perimeters.

 *  @author Aurona Liu
 *  ID:114138778
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.0, 40.0);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        r1.setColor("red");
        r2.setColor("red");
        System.out.printf("Area of rectangle with height %f, width %f and color %s is %f, and its perimeter is %f \n"
                ,r1.getHeight(),r1.getWidth(),r1.getColor(),r1.getArea(),r1.getPerimeter());
        System.out.printf("Area of rectangle with height %f, width %f and color %s is %f, and its perimeter is %f \n"
                ,r2.getHeight(),r2.getWidth(),r2.getColor(),r2.getArea(),r2.getPerimeter());


    }
}