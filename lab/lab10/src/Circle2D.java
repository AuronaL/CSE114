/**
 Design and implement a Circle2D class that contains:
 *
 *    @author Aurona Liu
 *    ID:114138778
 */
public class Circle2D {
    //center of the circle
    private double x;
    private double y;
    private double radius;

    //getter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    //constructor
    public Circle2D(){
        x=0;
        y=0;
        radius=1;
    }

    public Circle2D(double x, double y, double r){
        this.x=x;
        this.y=y;
        radius=r;
    }

    public double getArea(){
        return 3.1415 * Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 3.1415*2*radius;
    }

    //returns true if the specified point (x, y) is inside
    public boolean contains(double x, double y){
        return (this.x-radius<x && this.x+radius >x) && (this.y-radius<y && this.y+radius >y);
    }

    public boolean contains(Circle2D circle){
        return this.contains(circle.x,circle.y) && this.radius > circle.radius;
    }

    public boolean overlaps(Circle2D circle){
        return this.x==circle.getX() && this.y == circle.getY() && this.radius == circle.getRadius();
    }
}
