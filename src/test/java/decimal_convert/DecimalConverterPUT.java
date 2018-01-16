package decimal_convert;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class DecimalConverterPUT {

    private static int[] INPUT1 = { DecimalConverter.Binary, 2 };
    private static int[] INPUT2 = { DecimalConverter.Octal, 8 };
    private static int[] INPUT3 = { DecimalConverter.Decimal, 10 };
    private static int[] INPUT4 = { DecimalConverter.Hexadecimal, 16 };
    private static int[] INPUT5 = { DecimalConverter.Binary, -1 };
    private static int[] INPUT6 = { DecimalConverter.Binary, 0 };
    private static int[] INPUT7 = { 3, 10 };
    private static int[] INPUT8 = { 2, 10 };
    private static int[] INPUT9 = { 16, 10 };
    
    @DataPoints
    public static Fixture[] TestData = {
            new Fixture("10", INPUT1), // Data1
            new Fixture("10", INPUT2), // Data2
            new Fixture("10", INPUT3), // Data3
            new Fixture("10", INPUT4), // Data4
            new Fixture(null, INPUT5), // Data5
            new Fixture("0", INPUT6), // Data6
            new Fixture(null, INPUT7), // Data7
            new Fixture("1010", INPUT8), // Data8
            new Fixture("a", INPUT9), // Data9
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
