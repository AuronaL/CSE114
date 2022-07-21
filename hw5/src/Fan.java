
/**
 *  Write a test program named TestFan that creates two Fan objects.
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class Fan {
    /**
     * The default speed, on/off, radius and color of a fan
     */
    //Three constants named SLOW, MEDIUM, and FAST with values 1, 2, and 3 to denote the fan speed
    public int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    /**
     * Construct a fan object
     */
    //- A no-arg constructor that creates a default fan.
    Fan(){
    }

    /**
     * getter & setter for all datas
     */

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * - A method named toString() that returns a string description for the fan.
     * @return If the fan is on, the method returns the fan speed, color, and radius in one combined string.
     * If the fan is not on, the method returns fan color and radius along with the string "fan is off" in one combined string
     */
    public String toString(){
        //condition operator
       return on ? "speed "+ speed+" , "+color+" , "+"radius "+ radius +"\n" : "fan is off\n";
    }
}
