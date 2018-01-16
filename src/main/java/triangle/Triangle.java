package triangle;

public class Triangle {
    public enum Type {
        Equilateral, // 正三角形
        Isosceles,   // 二等辺三角形
        Scalene,     // その他の三角形
        NotTriangle, // 三角形ができない
        IllegalInput // 不正入力(0など)
    }


    public static Type judgeTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return Type.IllegalInput;
        }

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;

        if (max > mid + min) {
            return Type.NotTriangle;
        }

        if (max == min) {
            return Type.Equilateral;
        } else if (max == mid || mid == min) {
            return Type.Isosceles;
        } else {
            return Type.Scalene;
        }
    }
}
