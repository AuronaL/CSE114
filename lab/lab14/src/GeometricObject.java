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
public abstract class GeometricObject implements Comparable, Cloneable{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public Object clone(){
        try{
            GeometricObject g = (GeometricObject) (super.clone());
            return g;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Comparable max(Comparable o1, Comparable o2){
        if(o1.compareTo(o2)>0)
            return o1;
        else
            return o2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Implement the compareTo method defined in Comparable */


    public String toString() {
        return  "created on " + dateCreated + "\ncolor: " + color ;
    }

    public abstract int compareTo(GeometricObject o);

    public abstract void howToColor();

    /**
     * Abstract method getArea
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter
     */
    public abstract double getPerimeter();
}
