package decimal_convert;

import org.junit.Assert;
import org.junit.Test;

public class DecimalConverterCUT {
    @Test
    public void testDecimalConvertBinary0() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, 0);
        Assert.assertEquals("0", actual);
    }

    @Test
    public void testDecimalConvertBinary2() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, 2);
        Assert.assertEquals("10", actual);
    }

    @Test
    public void testDecimalConvertBinary10() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, 10);
        Assert.assertEquals("1010", actual);
    }

    @Test
    public void testDecimalConvertBinary100() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, 100);
        Assert.assertEquals("1100100", actual);
    }

    @Test
    public void testDecimalConvertBinaryMax() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, Integer.MAX_VALUE);
        Assert.assertEquals("1111111111111111111111111111111", actual);
    }

    @Test
    public void testDecimalConvertOctal0() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Octal, 0);
        Assert.assertEquals("0", actual);
    }

    @Test
    public void testDecimalConvertOctal2() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Octal, 2);
        Assert.assertEquals("2", actual);
    }

    @Test
    public void testDecimalConvertOctal10() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Octal, 10);
        Assert.assertEquals("12", actual);
    }

    @Test
    public void testDecimalConvertOctal100() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Octal, 100);
        Assert.assertEquals("144", actual);
    }

    @Test
    public void testDecimalConvertDecimal0() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Decimal, 0);
        Assert.assertEquals("0", actual);
    }

    @Test
    public void testDecimalConvertDecimal2() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Decimal, 2);
        Assert.assertEquals("2", actual);
    }

    @Test
    public void testDecimalConvertDecimal10() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Decimal, 10);
        Assert.assertEquals("10", actual);
    }

    @Test
    public void testDecimalConvertDecimal100() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Decimal, 100);
        Assert.assertEquals("100", actual);
    }

    @Test
    public void testDecimalConvertHexadecimal0() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Hexadecimal, 0);
        Assert.assertEquals("0", actual);
    }

    @Test
    public void testDecimalConvertHexadecimal2() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Hexadecimal, 2);
        Assert.assertEquals("2", actual);
    }

    @Test
    public void testDecimalConvertHexadecimal10() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Hexadecimal, 10);
        Assert.assertEquals("a", actual);
    }

    @Test
    public void testDecimalConvertHexadecimal100() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Hexadecimal, 100);
        Assert.assertEquals("64", actual);
    }

    @Test
    public void testDecimalConvertIllegalType() {
        String actual = DecimalConverter.decimalConvert(-1, 1);
        Assert.assertEquals(null, actual);
    }

    @Test
    public void testDecimalConvertNegativeValue() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, -1);
        Assert.assertEquals(null, actual);
    }
}
