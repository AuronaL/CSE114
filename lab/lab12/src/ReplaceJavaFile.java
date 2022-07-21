import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**Write a program that replaces every â€œJavaâ€ word in a file into the word â€œHTMLâ€ and saves
 the file in the same location on disk after printing both the old lines and new lines to the
 output. The input file is passed to the program as a command line argument.

 Sample file: input.txt
 Welcome to Java!
 This is a Java program.
 I like programming in Java.

 *   @author Aurona Liu
 *   ID:114138778
 */

public class ReplaceJavaFile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            // Create a File instance
            java.io.File file = new java.io.File("input.txt");

            // Create a Scanner for the file
            if (!file.exists()) throw new FileNotFoundException("File not found");
            Scanner input = new Scanner(file);

            List<String> str = new ArrayList<>();
            // Read data from a file using input, e.g. input.next()
            // input.hasNext() determines if there's more data in the file
            while (input.hasNextLine()) {
                String a = input.nextLine();
                if (a.contains("Java"))
                    a=a.replace("Java", "HTML");
                str.add(a);
            }
            //Use the following statements to write to a file:

            // Create a File instance
            java.io.File newFile = new java.io.File("outputFile.txt");

            // Create the file
            java.io.PrintWriter output = new java.io.PrintWriter(newFile);

            // Write output to the file, this can be repeated
            for (String s : str) {
                output.println(s);
            }
            System.out.println("Success!");
            // Close the file
            output.close();
            input.close();
        }catch (FileNotFoundException E){
            System.out.println("File not found");
        }
    }
}
