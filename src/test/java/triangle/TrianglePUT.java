package triangle;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TrianglePUT {

    // Data1
    private static int[] INPUT0 = {1, 1, 1};
    private static Triangle.Type EXPECTED0 = Triangle.Type.Equilateral;
    // D.Morita
    private static int[] INPUT1 = {0, 1, 1};
    private static Triangle.Type EXPECTED1 = Triangle.Type.IllegalInput;
    private static int[] INPUT2 = {1, 0, 1};
    private static Triangle.Type EXPECTED2 = Triangle.Type.IllegalInput;
    private static int[] INPUT3 = {1, 1, 0};
    private static Triangle.Type EXPECTED3 = Triangle.Type.IllegalInput;
    private static int[] INPUT4 = {2, 2, 3};
    private static Triangle.Type EXPECTED4 = Triangle.Type.Isosceles;
    private static int[] INPUT5 = {2, 2, 1};
    private static Triangle.Type EXPECTED5 = Triangle.Type.Isosceles;
    private static int[] INPUT6 = {3, 4, 5};
    private static Triangle.Type EXPECTED6 = Triangle.Type.Scalene;
    private static int[] INPUT7 = {2, 1, 1};
    private static Triangle.Type EXPECTED7 = Triangle.Type.NotTriangle;
    private static int[] INPUT8 = {0, 0, 0};
    private static Triangle.Type EXPECTED8 = Triangle.Type.IllegalInput;
    private static int[] INPUT9 = {5, 12, 13};
    private static Triangle.Type EXPECTED9 = Triangle.Type.Scalene;
    private static int[] INPUT10 = {5, 5, 5};
    private static Triangle.Type EXPECTED10 = Triangle.Type.Equilateral;
    private static int[] INPUT11 = {5, 5, 8};
    private static Triangle.Type EXPECTED11 = Triangle.Type.Isosceles;
    // Y.Mao
    private static int[] INPUT12 = {1, 1, 1};
    private static Triangle.Type EXPECTED12 = Triangle.Type.Equilateral;
    private static int[] INPUT13 = {5, 5, 6};
    private static Triangle.Type EXPECTED13 = Triangle.Type.Isosceles;
    private static int[] INPUT14 = {0, 1, 1};
    private static Triangle.Type EXPECTED14 = Triangle.Type.IllegalInput;
    private static int[] INPUT15 = {1, 10, 100};
    private static Triangle.Type EXPECTED15 = Triangle.Type.NotTriangle;
    private static int[] INPUT16 = {2, 3, 4};
    private static Triangle.Type EXPECTED16 = Triangle.Type.Scalene;
    private static int[] INPUT17 = {1, 0, 1};
    private static Triangle.Type EXPECTED17 = Triangle.Type.IllegalInput;
    private static int[] INPUT18 = {1, 1, 0};
    private static Triangle.Type EXPECTED18 = Triangle.Type.IllegalInput;
    private static int[] INPUT19 = {3, 4, 4};
    private static Triangle.Type EXPECTED19 = Triangle.Type.Isosceles;
    

    @DataPoints
    public static Fixture[] TestData = {
            new Fixture(EXPECTED0, INPUT0),   // TestData[0]
            new Fixture(EXPECTED1, INPUT1),   // TestData[1]
            new Fixture(EXPECTED2, INPUT2),   // TestData[2]
            new Fixture(EXPECTED3, INPUT3),   // TestData[3]
            new Fixture(EXPECTED4, INPUT4),   // TestData[4]
            new Fixture(EXPECTED5, INPUT5),   // TestData[5]
            new Fixture(EXPECTED6, INPUT6),   // TestData[6]
            new Fixture(EXPECTED7, INPUT7),   // TestData[7]
            new Fixture(EXPECTED8, INPUT8),   // TestData[8]
            new Fixture(EXPECTED9, INPUT9),   // TestData[9]
            new Fixture(EXPECTED10, INPUT10), // TestData[10]
            new Fixture(EXPECTED11, INPUT11), // TestData[11]
            new Fixture(EXPECTED12, INPUT12), // TestData[12]
            new Fixture(EXPECTED13, INPUT13), // TestData[13]
            new Fixture(EXPECTED14, INPUT14), // TestData[14]
            new Fixture(EXPECTED15, INPUT15), // TestData[15]
            new Fixture(EXPECTED16, INPUT16), // TestData[16]
            new Fixture(EXPECTED17, INPUT17), // TestData[17]
            new Fixture(EXPECTED18, INPUT18), // TestData[18]
            new Fixture(EXPECTED19, INPUT19), // TestData[19]
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
