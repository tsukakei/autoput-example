ご協力いただきましてありがとうございます。

このレポジトリの構成は以下の通りです。

- 4つのサンプルプロジェクトのソースコード
- それに対するJUnitで書かれたテストケース
    - 一般的な _@Test_ を用いたもの
    - _@Theory_ と _@DataPoints_ を用いたもの

サンプルプロジェクトは次のとおりです。
1. FizzBuzz
    - 有名問題のFizzBuzz
1. DecimalConverter
    - 与えられた10進数の整数を2進数, 8進数, 10進数, 16進数で返す
1. Triangle
    - 与えられた3つの整数の組でできる三角形の形状(正三角形など)を返す
1. Person
    - オブジェクト指向プログラミングの問題。与えられた性別と名前に応じた挨拶(Say hello)をしてくる。
    
# 必要なもの
1. Java
1. Maven
 
*IDE(EclipseやIntelliJ)があるといいかもしれません。

# 課題の説明
サンプルプロジェクトに対して、既にテストケースが実装されています。
ただ、これらのテストケースが実装されてからプロダクションコードの方に
仕様の変更（後述）があり、その影響でテストケースがいくつか失敗してしまいます。
そこで、失敗しているテストケースを特定・修正していただきたいです。

# サンプルプロジェクトの説明
## FizzBuzz
FizzBuzz問題の実装

### 変更前の仕様
- 入力：int型の整数。0未満は不正入力
- 出力：String型の文字列
    - 不正入力(0未満の整数) → null
    - 入力が15で割り切れる時 → "FizzBuzz"
    - 入力が15で割り切れない、かつ3で割り切れる時 → "Fizz"
    - 入力が15で割り切れない、かつ5で割り切れる時 → "Buzz"
    - それ以外の時 → 入力値を文字列にして返す
    
### 変更した仕様
1. 0も不正入力として扱うようにする。つまり0以下は不正入力。
1. 3でも5でも割り切れず、かつ3の付く数字は"Sekai-no-Nabeatsu"と返す

## DecimalConveter
与えられた10進数の整数を2進数, 8進数, 10進数, 16進数で返すプログラム

### 変更前の仕様
- 入力：
    - base: int型の整数。Binary, Octal, Decimal, Hexadecimalの4種類以外は不正入力
    - num: int型の整数。0未満の整数は
- 出力：String型の文字列
    - numが0未満の整数の時 → null
    - baseがBinaryの時 → numの2進数表示
    - baseがOctalの時 → numの8進数表示
    - baseがDecimalの時 → numの10進数表示
    - baseがHexadecimalの時 → numの16進数表示
    - numが1以上の整数、かつbaseが上記以外の時 → null

### 変更した仕様
1. numが0以下の整数の時、"IllegalNum"と返す
1. numが1以上の整数、かつbaseが上記以外の時、"IllegalBase"と返す

## Triangle
与えられた3つの整数の組でできる三角形の形状(正三角形など)を返す

### 変更前の仕様
- 入力：
    - a: int型の整数。0以下は不正入力
    - b: int型の整数。0以下は不正入力
    - c: int型の整数。0以下は不正入力
- 出力：三角形の形状をenum型で返す。三角形の形は
    - Equilateral: 正三角形
    - Isosceles: 二等辺三角形
    - Scalene: その他の三角形
    - NotTriangle: 三角形ができない
    - IllegalInput: a, b, cのいずれかに不正入力  

### 変更した仕様
1. 三角形の形状にFlatLineを追加
    - FlatLine: 最大の辺の長さとその他の2辺の長さの和が等しい形状(例.{4, 1, 3})
1. 三角形の形状にIsoscelesWithOneShortSideを追加
    - IsoscelesWithOneShortSide: 1辺が短く他の2辺がそれより長い二等辺三角形(例.{4, 4, 3})
    
## Person
インスタンスが与えられた性別と名前に応じた挨拶(Say hello)をするプログラム。

### 変更前の仕様
- Personクラス：
    - sex: enum型。性別。MALEかFEMALE。
    - name: String型の文字列。名前。
- say_helloメソッド：挨拶をするプログラム
    - 出力：String型の整数
        - 性別がMALEのとき → "Hello, I am Mr. {name}."
        - 性別がFEMALEのとき → "Hello, I am Ms. {name}."  

### 変更した仕様
1. FEMALEのPrefixを"Ms."から"Miss"に変更。つまり、性別がFEMALEのとき → "Hello, I am Miss. {name}."と出力。
1. 性別関係なく、名前が空白(""や" ")の時 → "I AM A CAT. As yet I have no name." (吾輩は猫である。名前はまだない。)と出力。

#　エラーメッセージの見方

## CUT

```CUT.java
import org.junit.Test;

public class AdderTest {
    @Test 
    public void testAdd1() {
        int expected = 3;
        int actual = Adder.add(1, 2);
        assertEquals(expected, actual);
    }
    
    @Test 
    public void testAdd2 () {
        int expected = -4; // TYPO
        int actual = Adder.add(-1, -2);
        assertEquals(expected, actual); // fail!
    }
}
```

### エラーメッセージ

例：
```
Failed tests: testAdd2(AdderTest): expected:<FizzBuzz> but was:<null>
```


読み方：
`Adder` クラスの `testAdd2` メソッドで 期待値 `-4` なのに 実際の値は `-3` だったよ。

```
Failed tests: テストメソッド名(テストクラス名): expected:<期待値の値> but was:<実際の値>
```

## PUT

```PUT.java
import org.junit.experimental.RunWith;
import org.junit.theories.Theories;
import org.junit.theories.Theory;
import org.junit.theories.DataPoint;

@RunWith(Theories.class)
public class AdderTest {

    private static int EXPECTED0 = 3;
    private static int[] INPUT0 = {1, 2};
    private static int EXPECTED1 = -4; // TYPO 
    private static int[] INPUT1 = { -1, -2};
    
    @DataPoints // testAdd1
    public static Fixture[] TestData = {
        new Fixture(EXPECTED0, INPUT0), // TestData[0]
        new Fixture(EXPECTED1, INPUT1), // TestData[1]
    };
                                 
    @Theory public void testAdd(Fixture fixture) {
        int expected = fixture._expected;
        int actual = 
            Adder.add(fixture._input[0], fixture._input[1]);
        assertEquals(expected, actual);
    }
    
    static class Fixture {
        private int _expected;
        private int[] _input;
        Fixture(int expected, int[] input) {
            this._expected = expected;
            this._input = input;
        }
    } 
}
```

### エラーメッセージ

例：

```
Failed tests: testAdd(AdderTest): testAdd("AddetTest$Fixture@299a06ac" <from TestData[1]>)
```


読み方：
`Adder` クラスの `testAdd` メソッドが `TestData[1]` で失敗したよ。

```
Failed tests: テストメソッド名(テストクラス名): テストメソッド名("テストクラス名t$Fixture@おまじない" <from n番目のテストデータ(0始まり)>)
```

また、失敗は逐一でしか報告されません。

# コマンド集

- クローン&コンパイル

```
 $ cd workspace
 $ git clone git@github.com:tsukakei/autoput-example.git
 $ cd autoput-example
 $ git checkout -b yourname
 $ mvn compile test-compile dependency:copy-dependencies 
``` 

- Gitブランチの変更

```
 $ git checkout -b yourname
```


- テスト実行

```
 $ sh/run.sh FizzBuzz CUT test
 $ sh/run.sh Triangle CUT test
 $ sh/run.sh DecimalConverter CUT test
 $ sh/run.sh Person CUT test
 
 $ sh/run.sh FizzBuzz PUT test
 $ sh/run.sh Triangle PUT test
 $ sh/run.sh DecimalConverter PUT test
 $ sh/run.sh Person PUT test
```


シェルスクリプトが動かない時は

```
 $ mvn test-compilet test -Dtest=FizzBuzzCUT
 $ mvn test-compilet test -Dtest=TriangleCUT
 $ mvn test-compilet test -Dtest=DecimalConverterCUT
 $ mvn test-compilet test -Dtest=PersonCUT

 $ mvn test-compilet test -Dtest=FizzBuzzPUT
 $ mvn test-compilet test -Dtest=TriangleCPUT
 $ mvn test-compilet test -Dtest=DecimalConverterCPUT
 $ mvn test-compilet test -Dtest=PersonPUT

```


- カバレッジ計測

```
 $ sh/run.sh FizzBuzz CUT jacoco
 $ sh/run.sh DecimalConverter CUT jacoco
 $ sh/run.sh Triangle CUT jacoco
 $ sh/run.sh Person CUT jacoco
 
 $ sh/run.sh FizzBuzz PUT jacoco
 $ sh/run.sh DecimalConverter PUT jacoco
 $ sh/run.sh Triangle PUT jacoco
 $ sh/run.sh Person PUT jacoco
```
    
- カバレッジ計測結果を見る
```
 $ open target/site/jacoco/index.html
```

- 質問に答える & コメント記入
    - 質問
        - 失敗テストの特定・修正にエラメッセージは重要か？
            - 1 (強くそう思う) から 5 (全くそう思わない)
        - CUTはPUTよりエラメッセージがわからりやすい？
            - 1 (強くそう思う) から 5 (全くそう思わない) 
    - 自由記述コメント
        - CUTとPUTのエラーメッセージについて
```
 $ vim yourname.txt
``` 
    

- Pushする

```
 $ git add src/test/java/*.java
 $ git add yourname.txt
 $ git commit -m "User experiment: Your Name"
 $ git push origin yourname
```



- ご協力ありがとうございます！

## Great Contributors
- Chihiro Iida ([@iidachihiro](https://github.com/iidachihiro))
- Yentian Mao ([@myt588](https://github.com/myt588))
- Koki Kato ([@ajalab](https://github.com/ajalab))
- Daichi Morita ([@forestaa](https://github.com/forestaa))
- Shinnosuke Saruwatari 