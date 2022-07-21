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
public class Square extends GeometricObject implements Colorable{
    private double side;
    public Square(){
        super();
        side = 4;
    }

    public Square(double side){
        super();
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color a square with " + getColor()+", side "+side);
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if(getArea()>o.getArea())
            return 1;
        else if (getArea()<o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public int compareTo(Object o) {
        if(getArea()>((GeometricObject)o).getArea())
            return 1;
        else if (getArea()<((GeometricObject)o).getArea())
            return -1;
        else
            return 0;
    }

    public String toString(){
        return "This square with side "+side+", color "+getColor();
    }

}
class Circle extends GeometricObject {
    private double radius;
    public Circle() { radius=10; }
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public int compareTo(GeometricObject o) {
        if(getArea()>o.getArea())
            return 1;
        else if (getArea()<o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public int compareTo(Object o) {
        if(getArea()>((GeometricObject)o).getArea())
            return 1;
        else if (getArea()<((GeometricObject)o).getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public void howToColor() {
        System.out.println("Color a circle with "+getColor()+", radius "+getRadius());
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    public double getDiameter() {
        return 2 * radius;
    }

    public String toString(){
        return "This circle with radius "+radius+", color "+getColor();
    }

}
class Rectangle extends GeometricObject implements Colorable {
    private double width;
    private double height;

    @Override
    public void howToColor() {
        System.out.println("Color a Rectangle with "+getColor()+", width "+width+", height "+height);
    }
    @Override
    public int compareTo(GeometricObject o) {
        if(getArea()>o.getArea())
            return 1;
        else if (getArea()<o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public int compareTo(Object o) {
        if(getArea()>((GeometricObject)o).getArea())
            return 1;
        else if (getArea()<((GeometricObject)o).getArea())
            return -1;
        else
            return 0;
    }
    public Rectangle() {
         super();
    }

    public Rectangle(double width, double height) {
        this();
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color,
                     boolean filled) {
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString(){
        return "This rectangle with width "+width+", the height "+height +", color "+getColor();
    }

}