/**
 Write an abstract superclass encapsulating a vehicle: A vehicle has two attributes: its owner's
 name and its number of wheels. This class has two non-abstract subclasses: one encapsulating a
 bicycle, and the other encapsulating a motorized vehicle. A motorized vehicle has the following
 additional attributes: its engine volume displacement, in liters; and a method computing and
 returning a measure of horsepower- the number of liters times the number of wheels. You also
 need to include a client class to test these classes.
 *
 *   @author Aurona Liu
 *   ID:114138778
 */public abstract class vehicle {
    private String owner;
    private int numberOfWheels;
    protected vehicle(){
        owner = "Mary";
        numberOfWheels = 2;
    }
    protected vehicle(String owner, int number){
        this.owner=owner;
        this.numberOfWheels =number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
class Bicycle extends vehicle{
    public Bicycle(){
      super();
    }

    public Bicycle(String owner, int number){
        super(owner, number);
    }

    public String toString(){
        return "Bicycle: owner is "+getOwner()+", number of wheels is "+getNumberOfWheels();
    }

}
class Motorized_vehicle extends vehicle{
    double engineVolumeDisplacement;
    public Motorized_vehicle(String owner, int number, double engineVolume){
       super(owner,number);
       engineVolumeDisplacement=engineVolume;
    }

    public double horsepower(){
        return this.getNumberOfWheels()*engineVolumeDisplacement;
    }

    public String toString(){
        return "Motorized_vehicle: owner is "+getOwner()+", number of wheels is "+getNumberOfWheels()+", engine volume displacement is "+engineVolumeDisplacement+" liters.";
    }
}
