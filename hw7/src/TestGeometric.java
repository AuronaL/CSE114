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
public class TestGeometric {
    public static void main(String[] args) {
        GeometricObject[] arr = new GeometricObject[4];
        arr[0] = new Circle(5);
        arr[1] = new Circle(2);
        arr[2] = new Rectangle(2,3);
        arr[3] = new Rectangle(5,10);

        //comparable
        System.out.println("Between circle 0 and circle 1 that has larger area: "+ GeometricObject.max(arr[0],arr[1]));// circle 0  with radius 5
        System.out.println("Between rectangle 2 and rectangle 3 that has larger area: "+ GeometricObject.max(arr[2],arr[3])); // rectangle with width 5, height 10

        //cloneable
        System.out.println("print out the copy of circle 0 : "+arr[0].clone());//circle clone
        System.out.println("print out the copy of rectangle 2 : "+arr[0].clone());//rectangle clone

    }

    /** Circle */
    static class Circle extends GeometricObject implements Comparable, Cloneable{
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

    /** Rectangle */
    static class Rectangle extends GeometricObject implements Comparable, Cloneable{
        private double width;
        private double height;

        @Override
        public int compareTo(GeometricObject o) {
            if (getArea() > o.getArea())
                return 1;
            else if (getArea() < o.getArea())
                return -1;
            else
                return 0;
        }

        @Override
        public int compareTo(Object o) {
            if (getArea() > ((GeometricObject) o).getArea())
                return 1;
            else if (getArea() < ((GeometricObject) o).getArea())
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

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }

        public String toString() {
            return "This rectangle with width " + width + ", the height " + height + ", color " + getColor();
        }
    }
}
