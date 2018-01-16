package decimal_convert;

import org.junit.Assert;
import org.junit.Test;

public class DecimalConverterCUT {
    @Test
    public void testDecimalConvert() {
        String actual = DecimalConverter.decimalConvert(DecimalConverter.Binary, 2);
        Assert.assertEquals("10", actual);
    }
}
