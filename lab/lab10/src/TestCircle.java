/**
 *  Write a test program that creates two Circle2D at centers (1,1) and (2,2) with radius of 2 (both classes).
 * Test all the methods contains.
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(1,1,2);
        Circle2D c2 = new Circle2D(2,2,2);
        Circle2D c3 = new Circle2D( 1,0, 1);
        Circle2D c4 = new Circle2D(1,1,2);
        System.out.println("The area for circle 1 :"+c1.getArea());
        System.out.println("The perimeter for circle 2 "+c2.getPerimeter());
        System.out.println("Circle 1 contains circle 2 : "+c1.contains(c2));
        System.out.println("Circle 1 contains circle 3 : "+c1.contains(c3));
        System.out.println("Circle 2 contains point (1,1) : "+c2.contains(1, 1));
        System.out.println("Circle 2 contains point (6,16) : "+c2.contains(6,16 ));
        System.out.println("Circle 1 and circle 2 are the same : "+c1.overlaps(c2));
        System.out.println("Circle 1 and Circle 4 are the same : "+c1.overlaps(c4));
    }
}
