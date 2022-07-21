import jdk.jshell.Snippet;

import java.util.Scanner;

/**
 Design a class named Person and two of its subclasses named Student and Employee. Make Faculty
 and Staff subclasses of Employee.

 *   @author Aurona Liu
 *   ID:114138778
 */
public class Student extends Person{
    public Student(String name, String address, String phoneNumber, String emailAddress, int age) {
        super(name, address, phoneNumber, emailAddress, age);
    }

    enum status{freshman, sophomore, junior, senior}
    status sta;
    public void setStatus(String s){
       switch (s){
           case "freshman": sta=status.freshman; break;
           case "sophomore": sta=status.sophomore; break;
           case "junior": sta = status.senior; break;
           case "senior": sta= status.junior; break;
       }
    }
    public String toString(){
        return "This student "+getName()+", "+sta +", "+getAge()+", "+getAddress()+", "+ getPhoneNumber()+", "+getEmailAddress();
    }
}
