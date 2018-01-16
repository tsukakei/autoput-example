package decimal_convert;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class DecimalConverterPUT {

    private static int[] INPUT1 = { DecimalConverter.Binary, 2 };

    @DataPoints
    public static Fixture[] TestData = {
            new Fixture("10", INPUT1), // Data1
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
