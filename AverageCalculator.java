/**
 * The error is detected upon changing the values e.g using 2,3,4,5 whose average is 3.5
 * The program displays an average of 3.0 because
 * Integer divide by integer results to an integer
 * Therefore there is a need to make one(either the divisor or the dividend) a double or float
 * The program can be therefore be corrected by making total a double instead of int
 * Below is the correct program
 */
public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        double total = 0;
        for (int num : numbers) {
            total += num;
        }
        double average = total / numbers.length;
        return average;
    }

    public static void main(String[] args) {
        int[] data = {2,3,4,5};//{ 5, 10, 15, 20, 25 };
        double result = calculateAverage(data);
        System.out.println("The average is: " + result);
    }
}