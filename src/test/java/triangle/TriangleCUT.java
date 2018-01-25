package triangle;

import org.junit.Assert;
import org.junit.Test;

import triangle.Triangle.Type;

public class TriangleCUT {

    @Test
    public void testTriangle0() {
        Triangle.Type ans = Triangle.judgeTriangle(1, 1, 1);
        Assert.assertEquals(Triangle.Type.Equilateral, ans);
    }
    // D.Morita
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
        Assert.assertEquals(Triangle.Type.IsoscelesWithOneShortSide, ans);
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
    // Y.Mao
    @Test
    public void testTriangle12() {
        Triangle.Type ans = Triangle.judgeTriangle(1, 1, 1);
        Assert.assertEquals(Triangle.Type.Equilateral, ans);
    }
    @Test
    public void testTriangle13() {
        Triangle.Type ans = Triangle.judgeTriangle(5, 5, 6);
        Assert.assertEquals(Triangle.Type.Isosceles, ans);
    }
    @Test
    public void testTriangle14() {
        Triangle.Type ans = Triangle.judgeTriangle(0, 1, 1);
        Assert.assertEquals(Triangle.Type.IllegalInput, ans);
    }
    @Test
    public void testTriangle15() {
        Triangle.Type ans = Triangle.judgeTriangle(1, 10, 100);
        Assert.assertEquals(Triangle.Type.NotTriangle, ans);
    }
    @Test
    public void testTriangle16() {
        Triangle.Type ans = Triangle.judgeTriangle(2, 3, 4);
        Assert.assertEquals(Triangle.Type.Scalene, ans);
    }
    @Test
    public void testTriangle17() {
        Triangle.Type ans = Triangle.judgeTriangle(1, 0, 1);
        Assert.assertEquals(Triangle.Type.IllegalInput, ans);
    }
    @Test
    public void testTriangle18() {
        Triangle.Type ans = Triangle.judgeTriangle(1, 1, 0);
        Assert.assertEquals(Triangle.Type.IllegalInput, ans);
    }
    @Test
    public void testTriangle19() {
        Triangle.Type ans = Triangle.judgeTriangle(3, 4, 4);
        Assert.assertEquals(Triangle.Type.IsoscelesWithOneShortSide, ans);
    }
}
