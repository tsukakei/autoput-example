package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzCUT {
    @Test
    public void testFizzBuzz1() {
        String actual = FizzBuzz.fizzbuzz(1);
        Assert.assertEquals("1", actual);
    }
    @Test
    public void testFizzBuzz2() {
        String actual = FizzBuzz.fizzbuzz(3);
        Assert.assertEquals("Fizz", actual);
    }
    @Test
    public void testFizzBuzz3() {
        String actual = FizzBuzz.fizzbuzz(5);
        Assert.assertEquals("Buzz", actual);
    }
    @Test
    public void testFizzBuzz4() {
        String actual = FizzBuzz.fizzbuzz(15);
        Assert.assertEquals("FizzBuzz", actual);
    }
    @Test
    public void testFizzBuzz5() {
        String actual = FizzBuzz.fizzbuzz(-1);
        Assert.assertEquals(null, actual);
    }
    @Test
    public void testFizzBuzz6() {
        String actual = FizzBuzz.fizzbuzz(0);
        Assert.assertEquals("FizzBuzz", actual);
    }
    
}
