package decimal_convert;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class DecimalConverterPUT {

    private static int[] INPUT1 = { DecimalConverter.Binary, 2 };
    private static int[] INPUT2 = { DecimalConverter.Octal, 2 };
    private static int[] INPUT3 = { DecimalConverter.Decimal, 2 };
    private static int[] INPUT4 = { DecimalConverter.Hexadecimal, 2 };
    private static int[] INPUT5 = { DecimalConverter.Hexadecimal, -1 };
    private static int[] INPUT6 = { DecimalConverter.Hexadecimal, 16 };
    private static int[] INPUT7 = { DecimalConverter.Octal, 8 };
    private static int[] INPUT8 = { DecimalConverter.Decimal, 10 };
    private static int[] INPUT9 = { 15, 10 };

    @DataPoints
    public static Fixture[] TestData = {
            new Fixture("10", INPUT1), // Data1
            new Fixture("2", INPUT2), // Data1
            new Fixture("2", INPUT3), // Data1
            new Fixture("2", INPUT4), // Data1
            new Fixture(null, INPUT5), // Data1
            new Fixture("10", INPUT6), // Data1
            new Fixture("10", INPUT7), // Data1
            new Fixture("10", INPUT8), // Data1
            new Fixture(null, INPUT9), // Data1
    };

    @Theory
    public void testDecimalConvert(Fixture fixture) {
        String actual = DecimalConverter.decimalConvert(fixture._input[0], fixture._input[1]);
        Assert.assertEquals(fixture._expected, actual);
    }


    static class Fixture {
        private String _expected;
        private int[]    _input;
        Fixture(String _expected, int[] _input) {
            this._expected = _expected;
            this._input    = _input;
        }
    }
}
