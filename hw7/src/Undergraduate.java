/**
 *  Write an abstract superclass encapsulating a college applicant:
 *  A college applicant has two attributes: the applicant's name and the college the applicant is applying to.
 *  This class has two non-abstract subclasses: one encapsulating an applicant for undergraduate school, and the other encapsulating an applicant for graduate school. An applicant for undergraduate school
 *  has two additional attributes: an SAT score and a GPA. An applicant for graduate school has one additional attribute: the college of origin.
 *  It also has a method that returns "from inside" if the college of origin is the same as the college applied to;
 *  otherwise, it returns "from outside." You also need to include a class to test these classes.
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class Undergraduate extends college_applicant {
    private double SAT;
    private double GPA;

    public Undergraduate(double sat, double gpa,String name, String school){
        super(name,school);
        SAT=sat;
        GPA=gpa;
    }

    public double getSAT() {
        return SAT;
    }

    public void setSAT(double SAT) {
        this.SAT = SAT;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public String toString(){
        return "The graduate : "+getName()+", apply for school: "+getSchool()+", from school"+", SAT: "+SAT+", GPA: "+getGPA();
    }
}
