/**
 Design a class named Person and two of its subclasses named Student and Employee. Make Faculty
 and Staff subclasses of Employee.

 *   @author Aurona Liu
 *   ID:114138778
 */
public class Person {
    private String name, address, phoneNumber,emailAddress;
    private int age;

    public Person(String name, String address, String phoneNumber, String emailAddress, int age) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.age = age;
    }

    public Person(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "This person: "+ name+", "+age+", "+address+", "+ phoneNumber+", "+emailAddress;
    }
}
