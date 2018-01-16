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

    @DataPoints
    public static Fixture[] TestData = {
            new Fixture(Triangle.Type.Equilateral, INPUT1), // Data1
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
