/**
 * 3 Enable GeometricObject comparable. Modify the GeometricObject class to implement the Comparable interface, and define a static max method in the GeometricObject class for finding the larger of two GeometricObject objects.
 * Draw the UML diagram and implement the new GeometricObject class. Write a test program that uses the max method to find the larger of two circles and the larger of two rectangles.
 *
 * 4 Enable GeometricObject cloneable.
 * Modify the GeometricObject class to implement the Cloneable interface.
 * Draw the UML diagram and implement the new GeometricObject class.
 * Write a test program that uses the clone method to copy a rectangle.
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
    // max method
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

    public abstract int compareTo(Object o);

    /**
     * Abstract method getArea
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter
     */
    public abstract double getPerimeter();
}
