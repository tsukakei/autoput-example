package triangle;

public class Triangle {

    static final int Equilateral  = 1; // 正三角形
    static final int Isosceles    = 2; // 二等辺三角形
    static final int Scalene      = 3; // その他の三角形
    static final int NotTriangle  = 4; // 三角形ができない
    static final int IllegalInput = 5; // 不正入力(0など)


    public static int judgeTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return IllegalInput;
        }

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;

        if (max >= mid + min) {
            return NotTriangle;
        }

        if (max == min) {
            return Equilateral;
        } else if (max == mid || mid == min) {
            return Isosceles;
        } else {
            return Scalene;
        }
    }
}
