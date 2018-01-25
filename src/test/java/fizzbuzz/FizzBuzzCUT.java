package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzCUT {
    @Test
    public void testFizzBuzz1() {
        String actual = FizzBuzz.fizzbuzz(1);
        Assert.assertEquals("1", actual);
    }
    // D.Morita
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
    // K.Kato
    @Test
    public void testFizzBuzz6() {
        String actual = FizzBuzz.fizzbuzz(0);
        Assert.assertEquals(null, actual);
    }
    @Test
    public void testFizzBuzz7() {
        String actual = FizzBuzz.fizzbuzz(2);
        Assert.assertEquals("2", actual);
    }
    @Test
    public void testFizzBuzz8() {
        String actual = FizzBuzz.fizzbuzz(3);
        Assert.assertEquals("Fizz", actual);
    }
    @Test
    public void testFizzBuzz9() {
        String actual = FizzBuzz.fizzbuzz(4);
        Assert.assertEquals("4", actual);
    }
    @Test
    public void testFizzBuzz10() {
        String actual = FizzBuzz.fizzbuzz(5);
        Assert.assertEquals("Buzz", actual);
    }
    @Test
    public void testFizzBuzz11() {
        String actual = FizzBuzz.fizzbuzz(6);
        Assert.assertEquals("Fizz", actual);
    }
    @Test
    public void testFizzBuzz12() {
        String actual = FizzBuzz.fizzbuzz(10);
        Assert.assertEquals("Buzz", actual);
    }
    @Test
    public void testFizzBuzz13() {
        String actual = FizzBuzz.fizzbuzz(15);
        Assert.assertEquals("FizzBuzz", actual);
    }
    @Test
    public void testFizzBuzz14() {
        String actual = FizzBuzz.fizzbuzz(30);
        Assert.assertEquals("FizzBuzz", actual);
    }
    @Test
    public void testFizzBuzz15() {
        String actual = FizzBuzz.fizzbuzz(-1);
        Assert.assertEquals(null, actual);
    }
    @Test
    public void testFizzBuzz16() {
        String actual = FizzBuzz.fizzbuzz(-3);
        Assert.assertEquals(null, actual);
    }
    @Test
    public void testFizzBuzz17() {
        String actual = FizzBuzz.fizzbuzz(-5);
        Assert.assertEquals(null, actual);
    }
    @Test
    public void testFizzBuzz18() {
        String actual = FizzBuzz.fizzbuzz(-15);
        Assert.assertEquals(null, actual);
    }
    @Test
    public void testFizzBuzz19() {
        String actual = FizzBuzz.fizzbuzz(Integer.MAX_VALUE);
        Assert.assertEquals("Sekai-no-Nabeatsu", actual);
    }
    @Test
    public void testFizzBuzz20() {
        String actual = FizzBuzz.fizzbuzz(Integer.MIN_VALUE);
        Assert.assertEquals(null, actual);
    }
}
