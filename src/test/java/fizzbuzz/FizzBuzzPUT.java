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
            new Fixture(null, -1),
            new Fixture("FizzBuzz", 15),
            new Fixture("Fizz", 333),
            new Fixture("Buzz", 1100),
            new Fixture("FizzBuzz", 0),
            new Fixture("64", 64),
            new Fixture(null, -15),
            new Fixture(null, -5),
            new Fixture(null, -33),
            new Fixture("53", 53),
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
