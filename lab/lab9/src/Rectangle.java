/**
 Design and implement a class named Rectangle to represent a rectangle. The class contains:

 - A no-arg constructor that creates a default rectangle.
 - A constructor that creates a rectangle with the specified width and height.
 - The accessor and mutator methods for all three data fields.
 - A method named getArea() that returns the area of this rectangle.
 - A method named getPerimeter() that returns the perimeter.

 *  @author Aurona Liu
 *  ID:114138778
 */
public class Rectangle {
    /**
     * The default width, height and color
     */
    private double width = 1.0;
    private double height = 1.0;
    private String color = "white";

    /**
     * Construct a rectangle object
     */
    //no-arg constructor
    public Rectangle(){
    }

    /**
     * Construct a rectangle object
     */
    public Rectangle(double width, double height){
        this.width =width;
        this.height=height;
    }

    /**
     * getter and setter
     * */
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * A method named getArea() that returns the area of this rectangle.
     */
    public double getArea(){
        return width*height;
    }

    /**
     * A method named getPerimeter() that returns the perimeter.
     */
    public double getPerimeter(){
        return 2*(height+width);
    }
}
