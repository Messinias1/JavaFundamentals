import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class App {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        char h = 'h';
        char c = 'c';
        int ii2 = 25;
        double dd2 = 54.4;
        String sv = "Jag älskar att lära mig Svenska";
        String nySV = "Jag vet inte";
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables.*/
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        s2 = scan.nextLine();
        s2 = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + d2);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + s2);

        scan.close();
    }
}