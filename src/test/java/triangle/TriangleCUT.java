package triangle;

import org.junit.Assert;
import org.junit.Test;

import static triangle.Triangle.Equilateral;
import static triangle.Triangle.IllegalInput;
import static triangle.Triangle.Isosceles;
import static triangle.Triangle.NotTriangle;
import static triangle.Triangle.Scalene;

public class TriangleCUT {
    @Test
    public void testTriangle1() {
        int ans = Triangle.judgeTriangle(0, 1, 1);
        Assert.assertEquals(IllegalInput, ans);
    }
    @Test
    public void testTriangle2() {
        int ans = Triangle.judgeTriangle(1, 0, 1);
        Assert.assertEquals(IllegalInput, ans);
    }
    @Test
    public void testTriangle3() {
        int ans = Triangle.judgeTriangle(1, 1, 0);
        Assert.assertEquals(IllegalInput, ans);
    }
    @Test
    public void testTriangle4() {
        int ans = Triangle.judgeTriangle(2, 2, 3);
        Assert.assertEquals(Isosceles, ans);
    }
    @Test
    public void testTriangle5() {
        int ans = Triangle.judgeTriangle(2, 2, 1);
        Assert.assertEquals(Isosceles, ans);
    }
    @Test
    public void testTriangle6() {
        int ans = Triangle.judgeTriangle(3, 4, 5);
        Assert.assertEquals(Scalene, ans);
    }
    @Test
    public void testTriangle7() {
        int ans = Triangle.judgeTriangle(2, 1, 1);
        Assert.assertEquals(NotTriangle, ans);
    }
    @Test
    public void testTriangle8() {
        int ans = Triangle.judgeTriangle(0, 0, 0);
        Assert.assertEquals(IllegalInput, ans);
    }
    @Test
    public void testTriangle9() {
        int ans = Triangle.judgeTriangle(5, 12, 13);
        Assert.assertEquals(Scalene, ans);
    }
    @Test
    public void testTriangle10() {
        int ans = Triangle.judgeTriangle(5, 5, 5);
        Assert.assertEquals(Equilateral, ans);
    }
    @Test
    public void testTriangle11() {
        int ans = Triangle.judgeTriangle(5, 5, 8);
        Assert.assertEquals(Isosceles, ans);
    }








}
