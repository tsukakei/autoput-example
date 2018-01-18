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
    // Data2
    private static int[] INPUT2 = {-1, 2, 3};
    // Data3
    private static int[] INPUT3 = {100, 2, 1};
    // Data4
    private static int[] INPUT4 = {5, 5, 1};
    // Data5
    private static int[] INPUT5 = {3, 4, 5};
    // Data6
    private static int[] INPUT6 = {1, 0, 1};
    // Data7
    private static int[] INPUT7 = {3, 2, -5};
    // Data8
    private static int[] INPUT8 = {100, 55, 55};

    @DataPoints
    public static Fixture[] TestData = {
            new Fixture(Triangle.Type.Equilateral, INPUT1), // Data1
            new Fixture(Triangle.Type.IllegalInput, INPUT2), // Data2
            new Fixture(Triangle.Type.NotTriangle, INPUT3), // Data3
            new Fixture(Triangle.Type.Isosceles, INPUT4), // Data4
            new Fixture(Triangle.Type.Scalene, INPUT5), // Data5
            new Fixture(Triangle.Type.IllegalInput, INPUT6), // Data6
            new Fixture(Triangle.Type.IllegalInput, INPUT7), // Data7
            new Fixture(Triangle.Type.Isosceles, INPUT8), // Data8
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
