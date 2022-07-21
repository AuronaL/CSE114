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
public class Graduate extends college_applicant{
    private String origin_college;

    public Graduate(String name, String school, String origin_college) {
        super(name, school);
        this.origin_college=origin_college;
    }

    //method inside/outside
    public String sameSchool(){
        return this.getSchool().equals(origin_college) ? "from inside":"from outside";
    }

    public String getOrigin_college() {
        return origin_college;
    }

    public void setOrigin_college(String origin_college) {
        this.origin_college = origin_college;
    }
    public String toString(){
        return "The graduate : "+getName()+", apply for school: "+getSchool()+", from school "+getOrigin_college();
    }
}
