/**
 * Design a class named Triangle that extends GeometricObject:
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    //constructor
    public Triangle(){
        super();
    }
    public Triangle(double s1, double s2 , double s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double getSide1() {
        return side1;
    }

    //Heron's Formula for the area of a triangle
    @Override
    public double getArea() {
        double p =(side1+side2+side3)/2;
        return Math.exp(p*(p-side3)*(p-side1)*(p-side2)) ;
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3;
    }

    public String toString(){
        return "For this triangle: The 3 sides are:"+ side1+", "+side2+", "+side3+", "+
                "the area is "+ getArea()+", the perimeter is "+getPerimeter()+
                ", the color is "+getColor()+", filled status: "+isFilled();
    }
}