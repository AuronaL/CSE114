/**
 * Write a test program named Triangle throw IllegalTriangleException
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class Triangle {
    private double side1 ,side2 , side3;
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
       if(side1+side2<=side3||side1+side3<=side2||side3+side2<=side3) throw new IllegalTriangleException();
       this.side1=side1;
       this.side2=side2;
       this.side3=side3;
    }
}
