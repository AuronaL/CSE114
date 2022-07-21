/**
 *  Write a test program named TestFan that creates two Fan objects.
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class TestFan {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        f1.setSpeed(f1.FAST);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);
        f2.setSpeed(f2.MEDIUM);
        f2.setRadius(5);
        f2.setColor("blue");
        System.out.println("The first fan is "+ f1.toString() +"The second "+ f2.toString());
    }
}
