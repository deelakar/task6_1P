package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopUtilsTest {

    @Test
    public void testSumArray() {
        // Test the sum of an array of positive integers
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = LoopUtils.sumArray(numbers);
        Assert.assertEquals(15, sum); // 1 + 2 + 3 + 4 + 5 = 15
    }

    @Test
    public void testSumArrayEmpty() {
        // Test the sum of an empty array
        int[] numbers = {};
        int sum = LoopUtils.sumArray(numbers);
        Assert.assertEquals(0, sum);
    }

    @Test
    public void testCountOddNumbers() {
        // Test the count of odd numbers in an array with a mix of even and odd numbers
        int[] numbers = {1, 2, 3, 4, 5};
        int count = LoopUtils.countOddNumbers(numbers);
        Assert.assertEquals(3, count); // Odd numbers are 1, 3, 5
    }

    @Test
    public void testCountOddNumbersNoOdds() {
        // Test an array with all even numbers
        int[] numbers = {2, 4, 6, 8};
        int count = LoopUtils.countOddNumbers(numbers);
        Assert.assertEquals(0, count); // No odd numbers
    }
}
