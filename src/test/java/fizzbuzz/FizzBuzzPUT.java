package fizzbuzz;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


@RunWith(Theories.class)
public class FizzBuzzPUT {

    private static int    INPUT1 = 1;
    private static String EXPECTED1 = "1";
    // D.Morita
    private static int    INPUT2 = 3;
    private static String EXPECTED2 = "Fizz";
    private static int    INPUT3 = 5;
    private static String EXPECTED3 = "Buzz";
    private static int    INPUT4 = 15;
    private static String EXPECTED4 = "FizzBuzz";
    private static int    INPUT5 = -1;
    private static String EXPECTED5 = null;
    // K.Kato
    private static int    INPUT6 = 0;
    private static String EXPECTED6 = "FizzBuzz";
    private static int    INPUT7 = 2;
    private static String EXPECTED7 = "2";
    private static int    INPUT8 = 3;
    private static String EXPECTED8 = "Fizz";
    private static int    INPUT9 = 4;
    private static String EXPECTED9 = "4";
    private static int    INPUT10 = 5;
    private static String EXPECTED10 = "Buzz";
    private static int    INPUT11 = 6;
    private static String EXPECTED11 = "Fizz";
    private static int    INPUT12 = 10;
    private static String EXPECTED12 = "Buzz";
    private static int    INPUT13 = 15;
    private static String EXPECTED13 = "FizzBuzz";
    private static int    INPUT14 = 30;
    private static String EXPECTED14 = "FizzBuzz";
    private static int    INPUT15 = -1;
    private static String EXPECTED15 = null;
    private static int    INPUT16 = -3;
    private static String EXPECTED16 = null;
    private static int    INPUT17 = -5;
    private static String EXPECTED17 = null;
    private static int    INPUT18 = -15;
    private static String EXPECTED18 = null;
    private static int    INPUT19 = Integer.MAX_VALUE;
    private static String EXPECTED19 = "2147483647";
    private static int    INPUT20 = Integer.MIN_VALUE;
    private static String EXPECTED20 = null;




    @DataPoints
    public static Fixture[] TestData = {
            new Fixture(EXPECTED1, INPUT1),
            // D.Morita
            new Fixture(EXPECTED2, INPUT2),
            new Fixture(EXPECTED3, INPUT3),
            new Fixture(EXPECTED4, INPUT4),
            new Fixture(EXPECTED5, INPUT5),
            // K.Kato
            new Fixture(EXPECTED6, INPUT6),
            new Fixture(EXPECTED7, INPUT7),
            new Fixture(EXPECTED8, INPUT8),
            new Fixture(EXPECTED9, INPUT9),
            new Fixture(EXPECTED10, INPUT10),
            new Fixture(EXPECTED11, INPUT11),
            new Fixture(EXPECTED12, INPUT12),
            new Fixture(EXPECTED13, INPUT13),
            new Fixture(EXPECTED14, INPUT14),
            new Fixture(EXPECTED15, INPUT15),
            new Fixture(EXPECTED16, INPUT16),
            new Fixture(EXPECTED17, INPUT17),
            new Fixture(EXPECTED18, INPUT18),
            new Fixture(EXPECTED19, INPUT19),
            new Fixture(EXPECTED20, INPUT20),
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
