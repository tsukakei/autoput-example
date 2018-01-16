package triangle;

import org.junit.Assert;
import org.junit.Test;

public class TriangleCUT {
    @Test
    public void testTriangle1() {
        Triangle.Type ans = Triangle.judgeTriangle(1, 1, 1);
        Assert.assertEquals(Triangle.Type.Equilateral, ans);
    }
}
