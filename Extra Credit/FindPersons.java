import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

/**
 * 1. (45 points) Prompt the user to input a name (first, last, or both) and then search the
 * given name in Cornell University directory (https://www.cornell.edu/search/?tab=people)
 * and print all students, faculty, staff, and alumni associated with the given name.
 * For example, the search for "Robert Smith" should list Faculty (1), Students (2), Staff
 * (1), Other (3), Alumni (50), Weill Cornell Medicine (1). The expected output for this
 * particular search is here.
 *
 *   @author Aurona Liu
 *   ID:114138778
 */
public class FindPersons {
    public static void main(String[] args) {
        try {
            // part 1
            String urlFirst = "https://www.cornell.edu/search/people.cfm?q=";
            String urlLast = "&tab=people";
            Scanner in = new Scanner(System.in);
            System.out.println("Please input a name: ");//Robert Smith
            String searchName = in.nextLine(); //replace scanner space with
            searchName = searchName.replace(" ", "+");

            String finalURL = urlFirst + searchName+ urlLast;
            Document document = Jsoup.connect(finalURL).get();
            Elements people =document.select("div#search-people");
            System.out.println("Faculty ("+people.select("span#FacultyHitsCount").html()+")"
                    +", Students ("+people.select("span#StudentHitsCount").html()+")"
                    +", Staff (" + people.select("span#StaffHitsCount").html() +"), Other ("
                    +people.select("span#OtherHitsCount").html()+"), Alumni ("
                    +people.select("span#AlumniHitsCount").html()+"), Weill Cornell Medicine ("
                    +people.select("span#Weill Cornell Medicine").html()+")");

//           list Faculty (1), Students (2), Staff
//(1), Other (3), Alumni (50), Weill Cornell Medicine (1).
//            System.out.println(result.html());
    }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}