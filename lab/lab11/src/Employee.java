/**
 Design a class named Person and two of its subclasses named Student and Employee. Make Faculty
 and Staff subclasses of Employee.

 *   @author Aurona Liu
 *   ID:114138778
 */
public class Employee extends Person{
    private double salary;
    private MyDate date_hired;

    public Employee(String name, double salary, MyDate date_hired) {
        super(name);
        this.salary = salary;
        this.date_hired = date_hired;
    }
    public String toString(){
        return "The employee "+ getName()+", the salary: " + getSalary()+", date of hired: " + getDate_hired();
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDate_hired() {
        return date_hired;
    }

    public void setDate_hired(MyDate date_hired) {
        this.date_hired = date_hired;
    }
}
class MyDate{
private int years, month, day;

public MyDate(int years,int month,int day){
    this.years=years;
    this.month=month;
    this.day=day;
}

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString(){
        return years+"-"+month+"-"+day;
    }
}

class Faculty extends Employee{
private int  rank;
private String office_hours;

    public Faculty(String name, double salary, MyDate date_hired, String office_hours, int rank) {
        super(name, salary, date_hired);
        this.office_hours = office_hours;
        this.rank = rank;
    }

    public int salaryRange(int rank){
    if(rank *(2022- getDate_hired().getYears())<10)  //(where years is current year minus date-hired year)
        return 1;
    else if (10 <= rank*(2022-getDate_hired().getYears())|| rank*getDate_hired().getYears() < 20)
        return 2;
   else return 3; // 20 <= rank*years
}

    public String toString(){
        return "The faculty "+ getName()+", salaryRange: "+salaryRange(rank)+", office_hours: "+office_hours+", rank: "+rank;
    }
}
class Staff extends Employee{
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
    public Staff(String name, double salary, MyDate date_hired, String title) {
        super(name, salary, date_hired);
        this.title = title;
    }
    public String toString(){
        return "The staff "+ getName()+", title: "+title +", salary: "+getSalary()+", date_hired: "+ getDate_hired();
    }
}

