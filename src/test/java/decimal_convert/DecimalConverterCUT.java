package decimal_convert;

import org.junit.Assert;
import org.junit.Test;

public class DecimalConverterCUT {
    @Test
    public void testDecimalConvert() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, 2);
        Assert.assertEquals("10", actual);
    }
    @Test
    public void testDecimalConvert1() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, -1);
        Assert.assertEquals(null, actual);
    }
    @Test
    public void testDecimalConvert2() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Octal, 9);
        Assert.assertEquals("11", actual);
    }
    @Test
    public void testDecimalConvert3() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Decimal, 12345);
        Assert.assertEquals("12345", actual);
    }
    @Test
    public void testDecimalConvert4() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Hexadecimal, 1000);
        Assert.assertEquals("3e8", actual);
    }
    @Test
    public void testDecimalConvert5() {
        String actual = DecimalConverter.decimalConvert(0, 2);
        Assert.assertEquals(null, actual);
    }
}
