/**
 * 2. Design an interface named Colorable with a void method named howToColor(). Every class of a
 * colorable object must implement the Colorable interface. Design a class named Square that extends
 * GeometricObject and implements Colorable. Implement howToColor to display a message on how to
 * color the square. Draw a UML diagram that involves Colorable, Square, and GeometricObject. Write
 * a test program that creates an array of five GeometricObjects. For each object in the array,
 * invoke its howToColor method if it is colorable.
 *
 * 3. Extend the GeometricObject class from the lecture notes to implement the Cloneable and
 * Comparable interfaces.
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class testGeo {
    public static void main(String[] args) {
        GeometricObject[] arr = new GeometricObject[5];
        arr[0] = new Circle(); //NOT colorable -> can not print
        arr[1] = new Rectangle(); //  colorable
        arr[2] = new Square(); // colorable
        arr[3] = new Square(5);
        arr[3].setColor("blue");
        arr[4] = new Rectangle(7,8);
        arr[4].setColor("Yellow");

        //colorable
        for (GeometricObject O: arr) {
            if(O instanceof Colorable ){
                ((Colorable) O).howToColor();
            }
        }
        //comparable
        System.out.println("The geometric object(1,2) that has larger area: "+GeometricObject.max(arr[1], arr[2]) ); // arr[2] square with side 4.0, color white
        System.out.println("The geometric object(0,3) that has larger area: "+GeometricObject.max(arr[0], arr[3]) ); //arr[0] circle with radius 10.0, color white
        System.out.println("The geometric object(2,3) that has larger area: "+GeometricObject.max(arr[2], arr[3])); //arr[3]square with side 5.0, color blue
        System.out.println("The geometric object(2,4) that has larger area: "+GeometricObject.max(arr[2], arr[4]) ); // arr[4] rectangle with width 7.0, the height 8.0, color Yellow
        System.out.println("The geometric object(0,4) that has larger area: "+GeometricObject.max(arr[0], arr[4]) ); // arr[0] circle with radius 10.0, color white

        //cloneable
        for (int i=0; i< arr.length; i++) {
            System.out.println("Cope of arr["+i+"] is "+arr[i].clone()); //5 items
        }
    }
}
