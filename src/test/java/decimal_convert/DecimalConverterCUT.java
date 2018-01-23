package decimal_convert;

import org.junit.Assert;
import org.junit.Test;

public class DecimalConverterCUT {
    @Test
    public void testDecimalConvert0() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, 2);
        Assert.assertEquals("10", actual);
    }
    // K.Kato
    @Test
    public void testDecimalConvert1() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, 0);
        Assert.assertEquals("0", actual);
    }
    @Test
    public void testDecimalConvert2() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, 10);
        Assert.assertEquals("1010", actual);
    }@Test
    public void testDecimalConvert3() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, 100);
        Assert.assertEquals("1100100", actual);
    }@Test
    public void testDecimalConvert4() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, Integer.MAX_VALUE);
        Assert.assertEquals("1111111111111111111111111111111", actual);
    }
    @Test
    public void testDecimalConvert5() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Octal, 0);
        Assert.assertEquals("0", actual);
    }
    @Test
    public void testDecimalConvert6() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Octal, 2);
        Assert.assertEquals("2", actual);
    }
    @Test
    public void testDecimalConvert7() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Octal, 10);
        Assert.assertEquals("12", actual);
    }
    @Test
    public void testDecimalConvert8() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Octal, 100);
        Assert.assertEquals("144", actual);
    }
    @Test
    public void testDecimalConvert9() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Decimal, 0);
        Assert.assertEquals("0", actual);
    }
    @Test
    public void testDecimalConvert10() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Decimal, 2);
        Assert.assertEquals("2", actual);
    }
    @Test
    public void testDecimalConvert11() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Decimal, 10);
        Assert.assertEquals("10", actual);
    }
    @Test
    public void testDecimalConvert12() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Decimal, 100);
        Assert.assertEquals("100", actual);
    }
    @Test
    public void testDecimalConvert13() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Hexadecimal, 0);
        Assert.assertEquals("0", actual);
    }
    @Test
    public void testDecimalConvert14() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Hexadecimal, 2);
        Assert.assertEquals("2", actual);
    }
    @Test
    public void testDecimalConvert15() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Hexadecimal, 10);
        Assert.assertEquals("a", actual);
    }
    @Test
    public void testDecimalConvert16() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Hexadecimal, 100);
        Assert.assertEquals("64", actual);
    }
    @Test
    public void testDecimalConvert17() {
        String actual = DecimalConverter.decimalConvert(-1, 1);
        Assert.assertEquals("IllegalBase", actual);
    }
    @Test
    public void testDecimalConvert18() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, -1);
        Assert.assertEquals("IllegalNum", actual);
    }
    // S.Saruwatari
    @Test
    public void testDecimalConvert19() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, -1);
        Assert.assertEquals("IllegalNum", actual);
    }
    @Test
    public void testDecimalConvert20() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Octal, 9);
        Assert.assertEquals("11", actual);
    }
    @Test
    public void testDecimalConvert21() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Decimal, 12345);
        Assert.assertEquals("12345", actual);
    }
    @Test
    public void testDecimalConvert22() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Hexadecimal, 1000);
        Assert.assertEquals("3e8", actual);
    }
    @Test
    public void testDecimalConvert23() {
        String actual = DecimalConverter.decimalConvert(0, 2);
        Assert.assertEquals("IllegalBase", actual);
    }
}
