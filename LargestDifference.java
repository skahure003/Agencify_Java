import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestDifference {
    int getLargestDifference(ArrayList<Integer> list) {
        int difference = 0;
        if (list.size() < 2) {
            return difference;// return 0;
        }
        Collections.sort(list);// Sort the list to easily access the minimum and the maximum number
        difference = list.get(list.size() - 1) - list.get(0); // maximum-minimum=largest difference
        return difference;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int size = 0;
        System.out.println("Enter list size:");
        Scanner sc = new Scanner(System.in);
        try {
            size = sc.nextInt();
            if (size < 0) {
                System.err.println("ERROR: ENTER A VALID LIST SIZE");
                System.exit(1);
            }
            System.out.println("ENTER THE ELEMENTS:");
            for (int i = 0; i < size; i++) {
                list.add(sc.nextInt());
            }
            System.out.println("LARGEST DIFFERENCE:- " + new LargestDifference().getLargestDifference(list));
        } catch (InputMismatchException ie) {
            /* Handle any non-integer input */
            System.err.println("ERROR: ENTER A VALID SIZE");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
