package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzCUT {
    @Test
    public void testFizzBuzz1() {
        String actual = FizzBuzz.fizzbuzz(1);
        Assert.assertEquals("1", actual);
    }
}
