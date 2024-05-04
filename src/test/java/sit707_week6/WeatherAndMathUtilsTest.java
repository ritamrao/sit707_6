package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
    
    @Test
    public void testStudentIdentity() {
        String studentId = "Ritam Sunil Rao";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "s223417356";
        Assert.assertNotNull("Student name is null", studentName);
    }
    
    @Test
    public void testFalseNumberIsEven() {
        Assert.assertFalse("Number is even", WeatherAndMathUtils.isEven(5));
    }
    
    
    @Test
    public void testTrueNumberIsEven() {
        Assert.assertTrue("Number is not even", WeatherAndMathUtils.isEven(4));
    }
    
    @Test
    public void testNumberIsPrime() {
        Assert.assertTrue("Number is not prime", WeatherAndMathUtils.isPrime(7));
    }
    
    @Test
    public void testNumberIsNotPrime() {
        Assert.assertFalse("Number is prime", WeatherAndMathUtils.isPrime(6));
    }
    
    @Test
    public void testCancelWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    @Test
    public void testWarnWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 3.5));
    }
    
    @Test
    public void testAllClearWeatherAdviceWithLowWindSpeedAndPrecipitation() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 2.0));
    }


    @Test
    public void testAllClearWeatherAdviceWithNormalWindSpeedAndPrecipitation() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(40.0, 3.0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWeatherAdviceWithNegativeValues() {
        WeatherAndMathUtils.weatherAdvice(-10.0, -5.0);
    }
    
    @Test
    public void testIsPrimeForPrimeNumber() {
        Assert.assertTrue("Number is not prime", WeatherAndMathUtils.isPrime(1));
    }
    
    @Test
    public void testIsPrimeForNonPrimeNumber() {
        Assert.assertFalse("Number is prime", WeatherAndMathUtils.isPrime(6));
    }
	
//    @Test
//    public void testIsOneForNonPrimeNumber() {
//        Assert.assertFalse("Number is prime", WeatherAndMathUtils.isPrime(6));
//    }


    

}
