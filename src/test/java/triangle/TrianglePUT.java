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
    private static int[] TC_EQ_1 = {3, 3, 3};
    private static int[] TC_EQ_2 = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
    private static int[] TC_ISO_1 = {3, 3, 4};
    private static int[] TC_ISO_2 = {4, 3, 3};
    private static int[] TC_ISO_3 = {3, 4, 3};
    private static int[] TC_SC_1 = {3, 4, 5};
    private static int[] TC_SC_2 = {5, 3, 4};
    private static int[] TC_SC_3 = {4, 5, 3};
    private static int[] TC_NT_1 = {3, 3, 100};
    private static int[] TC_NT_2 = {100, 3, 3};
    private static int[] TC_NT_3 = {3, 100, 3};
    private static int[] TC_NT_4 = {3, 4, 100};
    private static int[] TC_NT_5 = {100, 3, 4};
    private static int[] TC_NT_6 = {4, 100, 3};
    private static int[] TC_IL_1 = {0, 3, 3};
    private static int[] TC_IL_2 = {3, 0, 3};
    private static int[] TC_IL_3 = {3, 3, 0};

    @DataPoints
    public static Fixture[] TestData = {
            new Fixture(Triangle.Type.Equilateral, INPUT1), // Data1
            new Fixture(Triangle.Type.Equilateral, TC_EQ_1),
            // new Fixture(Triangle.Type.Equilateral, TC_EQ_2),
            new Fixture(Triangle.Type.Isosceles, TC_ISO_1),
            new Fixture(Triangle.Type.Isosceles, TC_ISO_2),
            new Fixture(Triangle.Type.Isosceles, TC_ISO_3),
            new Fixture(Triangle.Type.Scalene, TC_SC_1),
            new Fixture(Triangle.Type.Scalene, TC_SC_2),
            new Fixture(Triangle.Type.Scalene, TC_SC_3),
            new Fixture(Triangle.Type.NotTriangle, TC_NT_1),
            new Fixture(Triangle.Type.NotTriangle, TC_NT_2),
            new Fixture(Triangle.Type.NotTriangle, TC_NT_3),
            new Fixture(Triangle.Type.NotTriangle, TC_NT_4),
            new Fixture(Triangle.Type.NotTriangle, TC_NT_5),
            new Fixture(Triangle.Type.NotTriangle, TC_NT_6),
            new Fixture(Triangle.Type.IllegalInput, TC_IL_1),
            new Fixture(Triangle.Type.IllegalInput, TC_IL_2),
            new Fixture(Triangle.Type.IllegalInput, TC_IL_3),
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
