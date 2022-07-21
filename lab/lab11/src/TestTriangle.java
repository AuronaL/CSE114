/**
 * Design a class named Triangle that extends GeometricObject:
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(1, 1.5, 1);
        t2.setColor("yellow");
        t2.setFilled(true);
        System.out.println("Triangle 1: "+t1+";\nTriangle 2: "+t2+".");
    }

}
