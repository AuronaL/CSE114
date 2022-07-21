import jdk.jshell.Snippet;

/**
 Design a class named Person and two of its subclasses named Student and Employee. Make Faculty
 and Staff subclasses of Employee.

 *   @author Aurona Liu
 *   ID:114138778
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("Jenny", "1 Nathan Hale Dr","6315157014","Jenny21@gmail.com",20);
        System.out.println(person);
        Student student = new Student("Mike", "1 Nathan Hale Dr","6315157014","Jenny21@gmail.com",20);
        student.setStatus("sophomore");
        System.out.println(student);
        MyDate myDate = new MyDate(2002,3,12);
        Employee E1 = new Employee("Max",600000,myDate);
        System.out.println(E1);
        Staff s1 = new Staff("May",1200000,myDate, "manager");
        System.out.println(s1);
        Faculty f1 = new Faculty("Jack",1200000, myDate,"9:00-12:00", 1);
        System.out.println(f1);
    }
}
