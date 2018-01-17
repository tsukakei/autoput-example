package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzCUT {
    @Test
    public void testFizzBuzz0() {
        String actual = FizzBuzz.fizzbuzz(0);
        Assert.assertEquals("FizzBuzz", actual);
    }
    @Test
    public void testFizzBuzz1() {
        String actual = FizzBuzz.fizzbuzz(1);
        Assert.assertEquals("1", actual);
    }

    @Test
    public void testFizzBuzz2() {
        String actual = FizzBuzz.fizzbuzz(2);
        Assert.assertEquals("2", actual);
    }

    @Test
    public void testFizzBuzz3() {
        String actual = FizzBuzz.fizzbuzz(3);
        Assert.assertEquals("Fizz", actual);
    }

    @Test
    public void testFizzBuzz4() {
        String actual = FizzBuzz.fizzbuzz(4);
        Assert.assertEquals("4", actual);
    }

    @Test
    public void testFizzBuzz5() {
        String actual = FizzBuzz.fizzbuzz(5);
        Assert.assertEquals("Buzz", actual);
    }

    @Test
    public void testFizzBuzz6() {
        String actual = FizzBuzz.fizzbuzz(6);
        Assert.assertEquals("Fizz", actual);
    }

    @Test
    public void testFizzBuzz10() {
        String actual = FizzBuzz.fizzbuzz(10);
        Assert.assertEquals("Buzz", actual);
    }

    @Test
    public void testFizzBuzz15() {
        String actual = FizzBuzz.fizzbuzz(15);
        Assert.assertEquals("FizzBuzz", actual);
    }


    @Test
    public void testFizzBuzz30() {
        String actual = FizzBuzz.fizzbuzz(30);
        Assert.assertEquals("FizzBuzz", actual);
    }

    @Test
    public void testFizzBuzzN1() {
        String actual = FizzBuzz.fizzbuzz(-1);
        Assert.assertEquals(null, actual);
    }

    @Test
    public void testFizzBuzzN3() {
        String actual = FizzBuzz.fizzbuzz(-3);
        Assert.assertEquals(null, actual);
    }

    @Test
    public void testFizzBuzzN5() {
        String actual = FizzBuzz.fizzbuzz(-5);
        Assert.assertEquals(null, actual);
    }

    @Test
    public void testFizzBuzzN15() {
        String actual = FizzBuzz.fizzbuzz(-15);
        Assert.assertEquals(null, actual);
    }

    @Test
    public void testFizzBuzzMaxValue() {
        String actual = FizzBuzz.fizzbuzz(Integer.MAX_VALUE);
        Assert.assertEquals("2147483647", actual);
    }

    @Test
    public void testFizzBuzzMinValue() {
        String actual = FizzBuzz.fizzbuzz(Integer.MIN_VALUE);
        Assert.assertEquals(null, actual);
    }
}
