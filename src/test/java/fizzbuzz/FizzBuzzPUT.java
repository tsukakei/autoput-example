package fizzbuzz;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


@RunWith(Theories.class)
public class FizzBuzzPUT {

    @DataPoints
    public static Fixture[] TestData = {
            new Fixture("1", 1),
            new Fixture("Fizz", 3),
            new Fixture("Buzz", 5),
            new Fixture("FizzBuzz", 15),
            new Fixture(null, -1),
            new Fixture("FizzBuzz", 0),
            new Fixture("FizzBuzz", 45),
            new Fixture("FizzBuzz", 75),
            new Fixture("Fizz", 6),
            new Fixture("Buzz", 10),
    };

    @Theory
    public void testFizzBuzz(Fixture fixture) {
        String ans = FizzBuzz.fizzbuzz(fixture._input);
        Assert.assertEquals(fixture._expected, ans);
    }

    static class Fixture {
        private String _expected;
        private int _input;
        Fixture(String _expected, int _input) {
            this._expected = _expected;
            this._input = _input;
        }
    }
}
