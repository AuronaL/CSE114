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
public interface Colorable {
    public abstract void howToColor();
}

