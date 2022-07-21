import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

/**
 * 2. (45 points) Access a website of your choice with a comparison chart or any table of
 * information.
 *  Input: Name or any string to search for in a row.
 *  Output: Description or another information about the given name in the same row
 * For example, in this website: http://eartheasy.com/live_led_bulbs_comparison.html
 *  Sample input: Total cost for 25 bulbs
 *  Sample Output: $656.25 (or $656.25 $1000 $4275)
 *  OR
 *  Sample input: Cost per bulb
 *  Sample Output: $5 (or $5 $2 $1)
 *
 *   @author Aurona Liu
 *   ID:114138778
 */

public class PrintRowOfTable {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            // part 2
            String url = "http://eartheasy.com/live_led_bulbs_comparison.html";
            System.out.println("Please input a name or any string to search for in a row: ");
            String scannerRow = in.nextLine(); // Cost per bulb
            Document doc = Jsoup.connect(url).get();
            Element table = doc.select("table").get(0); //select the first table.
            Elements rows = table.select("tr");

            for (int i = 1; i < rows.size(); i++) { //first row is the col names so skip it.
                Element row = rows.get(i);
                Elements cols = row.select("td");

                if (cols.get(0).html().equals(scannerRow)) {
                    System.out.print(cols.html());
                }
            }
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
