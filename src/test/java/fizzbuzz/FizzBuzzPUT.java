package fizzbuzz;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


@RunWith(Theories.class)
public class FizzBuzzPUT {

    private static int    INPUT0 = 1;
    private static String EXPECTED0 = "1";
    // D.Morita
    private static int    INPUT1 = 3;
    private static String EXPECTED1 = "Fizz";
    private static int    INPUT2 = 5;
    private static String EXPECTED2 = "Buzz";
    private static int    INPUT3 = 15;
    private static String EXPECTED3 = "FizzBuzz";
    private static int    INPUT4 = -1;
    private static String EXPECTED4 = null;
    // K.Kato
    private static int    INPUT5 = 0;
    private static String EXPECTED5 = "FizzBuzz";
    private static int    INPUT6 = 2;
    private static String EXPECTED6 = "2";
    private static int    INPUT7 = 3;
    private static String EXPECTED7 = "Fizz";
    private static int    INPUT8 = 4;
    private static String EXPECTED8 = "4";
    private static int    INPUT9 = 5;
    private static String EXPECTED9 = "Buzz";
    private static int    INPUT10 = 6;
    private static String EXPECTED10 = "Fizz";
    private static int    INPUT11 = 10;
    private static String EXPECTED11 = "Buzz";
    private static int    INPUT12 = 15;
    private static String EXPECTED12 = "FizzBuzz";
    private static int    INPUT13 = 30;
    private static String EXPECTED13 = "FizzBuzz";
    private static int    INPUT14 = -1;
    private static String EXPECTED14 = null;
    private static int    INPUT15 = -3;
    private static String EXPECTED15 = null;
    private static int    INPUT16 = -5;
    private static String EXPECTED16 = null;
    private static int    INPUT17 = -15;
    private static String EXPECTED17 = null;
    private static int    INPUT18 = Integer.MAX_VALUE;
    private static String EXPECTED18 = "2147483647";
    private static int    INPUT19 = Integer.MIN_VALUE;
    private static String EXPECTED19 = null;




    @DataPoints
    public static Fixture[] TestData = {
            new Fixture(EXPECTED0, INPUT0),   // TestData[0]
            // D.Morita
            new Fixture(EXPECTED1, INPUT1),   // TestData[1]
            new Fixture(EXPECTED2, INPUT2),   // TestData[2]
            new Fixture(EXPECTED3, INPUT3),   // TestData[3]
            new Fixture(EXPECTED4, INPUT4),   // TestData[4]
            new Fixture(EXPECTED5, INPUT5),   // TestData[5]
            // K.Kato
            new Fixture(EXPECTED6, INPUT6),   // TestData[6]
            new Fixture(EXPECTED7, INPUT7),   // TestData[7]
            new Fixture(EXPECTED8, INPUT8),   // TestData[8]
            new Fixture(EXPECTED9, INPUT9),   // TestData[9]
            new Fixture(EXPECTED10, INPUT10), // TestData[10]
            new Fixture(EXPECTED11, INPUT11), // TestData[11]
            new Fixture(EXPECTED12, INPUT12), // TestData[12]
            new Fixture(EXPECTED13, INPUT13), // TestData[13]
            new Fixture(EXPECTED14, INPUT14), // TestData[14]
            new Fixture(EXPECTED15, INPUT15), // TestData[15]
            new Fixture(EXPECTED16, INPUT16), // TestData[16]
            new Fixture(EXPECTED17, INPUT17), // TestData[17]
            new Fixture(EXPECTED18, INPUT18), // TestData[18]
            new Fixture(EXPECTED19, INPUT19), // TestData[19]
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
