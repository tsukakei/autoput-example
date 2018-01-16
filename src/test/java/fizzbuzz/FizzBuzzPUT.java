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
