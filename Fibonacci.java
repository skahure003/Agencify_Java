import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /**
         * Declare variables n_0 and n_1 to store previous and the 
         * next elements of the Fibo sequence starting with 0, 1
         * The fib will store the calculated sequence number and n will store the user input
         */
        int n_0 = 0, n_1 = 1, fib, length;

        System.out.println("Enter the number of Fibonacci elements: ");
        try {
            length = (new Scanner(System.in)).nextInt(); // User input
            
            /* Handle any negative integer input */
            if (length < 1) {
                System.err.println("ERROR: ENTER A POSITIVE INTEGER");
                System.exit(1);
            } 
            /* Begin the sequence with 0 */
            System.out.println("FIBONACCI SEQUENCE:");
            System.out.print("0");

            /* Add 1 to the sequence if the user asked for more than 2 elements */
            if (length >= 2) {
                System.out.print(" 1");
            }

            /* Calculate subsequent sequence elements */
            for (int i = 2; i < length; i++) {
                fib = n_0 + n_1; // Calculate fib by sum of prev and next elements
                System.out.print(" " + fib); // Display fib
                n_0 = n_1; // The new previous value is what was in the next variable
                n_1=fib; // The new next value is the calculated fibonacci value
            }

        } catch (InputMismatchException ie) {
            /* Handle any non-integer input */
            System.err.println("ERROR: ENTER A VALID INTEGER");
        } catch (Exception e) {
            /* Handle any other kind of error */
            e.printStackTrace();
        }

    }
}