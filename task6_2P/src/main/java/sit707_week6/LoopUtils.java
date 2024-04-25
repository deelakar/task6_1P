package sit707_week6;

public class LoopUtils {

    /**
     * Function with a simple conditional loop (for-loop) that sums the elements of an array.
     *
     * @param numbers array of integers
     * @return the sum of all elements in the array
     */
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Function with a conditional loop containing a conditional statement.
     * It returns the count of odd numbers in the given array.
     *
     * @param numbers array of integers
     * @return the count of odd numbers in the array
     */
    public static int countOddNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) { // Conditional loop with a conditional statement
                count++;
            }
        }
        return count;
    }
}
