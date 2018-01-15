package sample2;

import org.junit.Assert;
import org.junit.Test;

public class TriangleCUT {
    @Test
    public void testJudgeTriangle1() {
        Triangle.Type ans = Triangle.judgeTriangle(1, 1, 1);
        Assert.assertEquals(Triangle.Type.Equilateral, ans);
    }

    @Test
    public void testJudgeTriangle2() {
        Triangle.Type ans = Triangle.judgeTriangle(2, 2, 2);
        Assert.assertEquals(Triangle.Type.Equilateral, ans);
    }
}
