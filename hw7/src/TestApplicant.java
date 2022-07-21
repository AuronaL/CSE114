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
public class TestApplicant {
    public static void main(String[] args) {
        Graduate grad1 = new Graduate("Mary", "SBU","SBU");
        Graduate grad2 = new Graduate("Allay", "SBU", "NYU");
        Undergraduate undergrad1 = new Undergraduate(1380,4.0,"Jason","SBU");
        System.out.println(grad1+"\nshe is "+grad1.sameSchool()+"\n"+grad2+"\nshe is "+grad2.sameSchool()+"\n"+undergrad1);
    }
}
