package decimal_convert;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class DecimalConverterPUT {

    private static int[] INPUT1 = { DecimalConverter.Binary, 2 };
    private static String EXPECTED1 = "10";
    // K.Kato
    private static int[] INPUT2 = { DecimalConverter.Binary, 0 };
    private static String EXPECTED2 = "0";
    private static int[] INPUT3 = { DecimalConverter.Binary, 10 };
    private static String EXPECTED3 = "1010";
    private static int[] INPUT4 = { DecimalConverter.Binary, 100 };
    private static String EXPECTED4 = "1100100";
    private static int[] INPUT5 = { DecimalConverter.Binary, Integer.MAX_VALUE };
    private static String EXPECTED5 = "1111111111111111111111111111111";
    private static int[] INPUT6 = { DecimalConverter.Octal, 0 };
    private static String EXPECTED6 = "0";
    private static int[] INPUT7 = { DecimalConverter.Octal, 2 };
    private static String EXPECTED7 = "2";
    private static int[] INPUT8 = { DecimalConverter.Octal, 10 };
    private static String EXPECTED8 = "12";
    private static int[] INPUT9 = { DecimalConverter.Octal, 100 };
    private static String EXPECTED9 = "144";
    private static int[] INPUT10 = { DecimalConverter.Decimal, 0 };
    private static String EXPECTED10 = "0";
    private static int[] INPUT11 = { DecimalConverter.Decimal, 2 };
    private static String EXPECTED11 = "2";
    private static int[] INPUT12 = { DecimalConverter.Decimal, 10 };
    private static String EXPECTED12 = "10";
    private static int[] INPUT13 = { DecimalConverter.Decimal, 100 };
    private static String EXPECTED13 = "100";
    private static int[] INPUT14 = { DecimalConverter.Hexadecimal, 0 };
    private static String EXPECTED14 = "0";
    private static int[] INPUT15 = { DecimalConverter.Hexadecimal, 2 };
    private static String EXPECTED15 = "2";
    private static int[] INPUT16 = { DecimalConverter.Hexadecimal, 10 };
    private static String EXPECTED16 = "a";
    private static int[] INPUT17 = { DecimalConverter.Hexadecimal, 100 };
    private static String EXPECTED17= "64";
    private static int[] INPUT18 = { -1, 1 };
    private static String EXPECTED18 = null;
    private static int[] INPUT19 = { DecimalConverter.Binary, -1 };
    private static String EXPECTED19 = null;
    // S.Saruwatari
    private static int[] INPUT20 = { DecimalConverter.Binary, -1 };
    private static String EXPECTED20 = null;
    private static int[] INPUT21 = { DecimalConverter.Octal, 9 };
    private static String EXPECTED21 = "11";
    private static int[] INPUT22 = { DecimalConverter.Decimal, 12345 };
    private static String EXPECTED22 = "12345";
    private static int[] INPUT23 = { DecimalConverter.Hexadecimal, 1000 };
    private static String EXPECTED23 = "3e8";
    private static int[] INPUT24 = { 0, 2 };
    private static String EXPECTED24 = null;
    

    @DataPoints
    public static Fixture[] TestData = {
            new Fixture(EXPECTED1, INPUT1), // Data1
            new Fixture(EXPECTED2, INPUT2), // Data2
            new Fixture(EXPECTED3, INPUT3), // Data3
            new Fixture(EXPECTED4, INPUT4), // Data4
            new Fixture(EXPECTED5, INPUT5), // Data5
            new Fixture(EXPECTED6, INPUT6), // Data6
            new Fixture(EXPECTED7, INPUT7), // Data7
            new Fixture(EXPECTED8, INPUT8), // Data8
            new Fixture(EXPECTED9, INPUT9), // Data9
            new Fixture(EXPECTED10, INPUT10), // Data10
            new Fixture(EXPECTED11, INPUT11), // Data11
            new Fixture(EXPECTED12, INPUT12), // Data12
            new Fixture(EXPECTED13, INPUT13), // Data13
            new Fixture(EXPECTED14, INPUT14), // Data14
            new Fixture(EXPECTED15, INPUT15), // Data15
            new Fixture(EXPECTED16, INPUT16), // Data16
            new Fixture(EXPECTED17, INPUT17), // Data17
            new Fixture(EXPECTED18, INPUT18), // Data18
            new Fixture(EXPECTED19, INPUT19), // Data19
            new Fixture(EXPECTED20, INPUT20), // Data20
            new Fixture(EXPECTED21, INPUT21), // Data21
            new Fixture(EXPECTED22, INPUT22), // Data22
            new Fixture(EXPECTED23, INPUT23), // Data23
            new Fixture(EXPECTED24, INPUT24), // Data24
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
