package decimal_convert;

public class DecimalConverter {

    public static final int Binary      = 2;
    public static final int Octal       = 8;
    public static final int Decimal     = 10;
    public static final int Hexadecimal = 16;


    public static String decimalConvert(int base, int num) {
        if (num < 0) {
            return null;
        }

        if (base == Binary) {
            return Integer.toBinaryString(num);
        } else if (base == Octal) {
            return Integer.toOctalString(num);
        } else if (base == Decimal) {
            return String.valueOf(num);
        } else if (base == Hexadecimal) {
            return Integer.toHexString(num);
        }

        return null;
    }
}
