package sample1;

import org.junit.*;

public class DiffSquareCUT {
    @Test
    public void testDiffSquare1() {
        Assert.assertEquals(0, DiffSquare.diffSquare(1, 1));
    }
    @Test
    public void testDiffSquare2() {
        Assert.assertEquals(3, DiffSquare.diffSquare(2, 1));
    }
}
