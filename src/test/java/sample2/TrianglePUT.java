package sample2;

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
    private static int[] INPUT2 = {2, 2, 2};

    @DataPoints
    public static Fixture[] TestData = {
            new Fixture(INPUT1), // Data1
            new Fixture(INPUT2), // Data2
    };

    @Theory
    public void testJudgeTriangle(Fixture fixture) {
        Triangle.Type ans = Triangle.judgeTriangle(fixture._input[0], fixture._input[1], fixture._input[2]);
        Assert.assertEquals(Triangle.Type.Equilateral, ans);
    }

    static class Fixture {
        private int[] _input;
        Fixture(int[] _input) {
            this._input = _input;
        }
    }
}
