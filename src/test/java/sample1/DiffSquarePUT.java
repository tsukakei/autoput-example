package sample1;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class DiffSquarePUT {

    // Data1
    private static int   EXPECTED1 = 0;
    private static int[] INPUT1    = {1, 1};
    // Data2
    private static int   EXPECTED2 = 3;
    private static int[] INPUT2    = {2, 1};


    @DataPoints
    public static Fixture[] TestData = {
            new Fixture(EXPECTED1, INPUT1), // Data1
            new Fixture(EXPECTED2, INPUT2), // Data2
    };

    @Theory
    public void testDiffSquare(Fixture fixture) {
        Assert.assertEquals(fixture._expected, DiffSquare.diffSquare(fixture._input[0], fixture._input[1]));
    }

    static class Fixture {
        private int _expected;
        private int[] _input;
        private Fixture(int _expected, int[] _input) {
            this._expected = _expected;
            this._input = _input;
        }
    }
}
