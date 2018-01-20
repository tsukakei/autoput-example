package triangle;

import org.junit.Assert;
import org.junit.Test;

public class TriangleCUT {
    @Test
    public void testTriangle1() {
        Triangle.Type ans = Triangle.judgeTriangle(0, 1, 1);
        Assert.assertEquals(Triangle.Type.IllegalInput, ans);
    }
    @Test
    public void testTriangle2() {
        Triangle.Type ans = Triangle.judgeTriangle(1, 0, 1);
        Assert.assertEquals(Triangle.Type.IllegalInput, ans);
    }
    @Test
    public void testTriangle3() {
        Triangle.Type ans = Triangle.judgeTriangle(1, 1, 0);
        Assert.assertEquals(Triangle.Type.IllegalInput, ans);
    }
    @Test
    public void testTriangle4() {
        Triangle.Type ans = Triangle.judgeTriangle(2, 2, 3);
        Assert.assertEquals(Triangle.Type.Isosceles, ans);
    }
    @Test
    public void testTriangle5() {
        Triangle.Type ans = Triangle.judgeTriangle(2, 2, 1);
        Assert.assertEquals(Triangle.Type.Isosceles, ans);
    }
    @Test
    public void testTriangle6() {
        Triangle.Type ans = Triangle.judgeTriangle(3, 4, 5);
        Assert.assertEquals(Triangle.Type.Scalene, ans);
    }
    @Test
    public void testTriangle7() {
        Triangle.Type ans = Triangle.judgeTriangle(2, 1, 1);
        Assert.assertEquals(Triangle.Type.NotTriangle, ans);
    }
    @Test
    public void testTriangle8() {
        Triangle.Type ans = Triangle.judgeTriangle(0, 0, 0);
        Assert.assertEquals(Triangle.Type.IllegalInput, ans);
    }
    @Test
    public void testTriangle9() {
        Triangle.Type ans = Triangle.judgeTriangle(5, 12, 13);
        Assert.assertEquals(Triangle.Type.Scalene, ans);
    }
    @Test
    public void testTriangle10() {
        Triangle.Type ans = Triangle.judgeTriangle(5, 5, 5);
        Assert.assertEquals(Triangle.Type.Equilateral, ans);
    }
    @Test
    public void testTriangle11() {
        Triangle.Type ans = Triangle.judgeTriangle(5, 5, 8);
        Assert.assertEquals(Triangle.Type.Isosceles, ans);
    }








}
