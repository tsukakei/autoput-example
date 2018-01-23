package triangle;

public class Triangle {
    public enum Type {
        Equilateral,                // 正三角形
        Isosceles,                  // 1辺が長く他の2辺がそれより短い二等辺三角形(例.{3, 3, 2})
        IsoscelesWithOneShortSide,  // 1辺が短く他の2辺がそれより長い二等辺三角形(例.{4, 4, 3})
        Scalene,                    // その他の三角形
        FlatLine,                   // 最大の長さの辺とその他の2辺の長さの和が等しい組み合わせ(例.{1, 2, 3})
        NotTriangle,                // 三角形ができない(例.{8, 4, 2})
        IllegalInput                // 不正入力(0以下の値)
    }


    public static Type judgeTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return Type.IllegalInput;
        }

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;

        if (max >= mid + min) {
            return Type.NotTriangle;
        }

        if (max == min) {
            return Type.Equilateral;
        } else if (max == mid) {
            return Type.IsoscelesWithOneShortSide;
        } else if (mid == min) {
            return Type.Isosceles;
        } else {
            return Type.Scalene;
        }
    }
}
