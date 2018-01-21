package triangle;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TrianglePUT {

    // Data1
    private static int[] INPUT1 = {1, 1, 1};
    private static Triangle.Type EXPECTED1 = Triangle.Type.Equilateral;
    // D.Morita
    private static int[] INPUT2 = {0, 1, 1};
    private static Triangle.Type EXPECTED2 = Triangle.Type.IllegalInput;
    private static int[] INPUT3 = {1, 0, 1};
    private static Triangle.Type EXPECTED3 = Triangle.Type.IllegalInput;
    private static int[] INPUT4 = {1, 1, 0};
    private static Triangle.Type EXPECTED4 = Triangle.Type.IllegalInput;
    private static int[] INPUT5 = {2, 2, 3};
    private static Triangle.Type EXPECTED5 = Triangle.Type.Isosceles;
    private static int[] INPUT6 = {2, 2, 1};
    private static Triangle.Type EXPECTED6 = Triangle.Type.Isosceles;
    private static int[] INPUT7 = {3, 4, 5};
    private static Triangle.Type EXPECTED7 = Triangle.Type.Scalene;
    private static int[] INPUT8 = {2, 1, 1};
    private static Triangle.Type EXPECTED8 = Triangle.Type.NotTriangle;
    private static int[] INPUT9 = {0, 0, 0};
    private static Triangle.Type EXPECTED9 = Triangle.Type.IllegalInput;
    private static int[] INPUT10 = {5, 12, 13};
    private static Triangle.Type EXPECTED10 = Triangle.Type.Scalene;
    private static int[] INPUT11 = {5, 5, 5};
    private static Triangle.Type EXPECTED11 = Triangle.Type.Equilateral;
    private static int[] INPUT12 = {5, 5, 8};
    private static Triangle.Type EXPECTED12 = Triangle.Type.Isosceles;
    // Y.Mao
    private static int[] INPUT13 = {1, 1, 1};
    private static Triangle.Type EXPECTED13 = Triangle.Type.Equilateral;
    private static int[] INPUT14 = {5, 5, 6};
    private static Triangle.Type EXPECTED14 = Triangle.Type.Isosceles;
    private static int[] INPUT15 = {0, 1, 1};
    private static Triangle.Type EXPECTED15 = Triangle.Type.IllegalInput;
    private static int[] INPUT16 = {1, 10, 100};
    private static Triangle.Type EXPECTED16 = Triangle.Type.NotTriangle;
    private static int[] INPUT17 = {2, 3, 4};
    private static Triangle.Type EXPECTED17 = Triangle.Type.Scalene;
    private static int[] INPUT18 = {1, 0, 1};
    private static Triangle.Type EXPECTED18 = Triangle.Type.IllegalInput;
    private static int[] INPUT19 = {1, 1, 0};
    private static Triangle.Type EXPECTED19 = Triangle.Type.IllegalInput;
    private static int[] INPUT20 = {3, 4, 4};
    private static Triangle.Type EXPECTED20 = Triangle.Type.Isosceles;
    

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
    };

    @Theory
    public void testTriangle(Fixture fixture) {
        Triangle.Type ans = Triangle.judgeTriangle(fixture._input[0], fixture._input[1], fixture._input[2]);
        Assert.assertEquals(fixture._expected, ans);
    }

    static class Fixture {
        private Triangle.Type _expected;
        private int[] _input;
        Fixture(Triangle.Type _expected, int[] _input) {
            this._expected = _expected;
            this._input = _input;
        }
    }
}
