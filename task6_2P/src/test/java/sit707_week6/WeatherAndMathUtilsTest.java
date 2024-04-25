package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "S223693522";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Deelaka Rathnayake";
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testFalseNumberIsEven() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(1));
    }

    @Test
    public void testCancelWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }

    @Test
    public void testWarnWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 3.0));
    }

    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(40.0, 2.0));
    }

    @Test
    public void testIsEvenTrue() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(2));
    }

    @Test
    public void testIsPrimeTrue() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(2));
    }

    @Test
    public void testIsPrimeFalse() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
    }

    @Test
    public void testContainsZeroTrue() {
        Assert.assertTrue(WeatherAndMathUtils.containsZero(new int[]{1, 0, 3}));
    }

    @Test
    public void testContainsZeroFalse() {
        Assert.assertFalse(WeatherAndMathUtils.containsZero(new int[]{1, 2, 3}));
    }

    @Test
    public void testCountEvenNumbers() {
        Assert.assertEquals(2, WeatherAndMathUtils.countEvenNumbers(new int[]{1, 2, 3, 4}));
    }
}
