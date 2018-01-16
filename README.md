Thank you for your cooperation!

This is a repository of sample projects for user experiment.

Sample projects are as follows:
1. FizzBuzz
    - 有名問題のFizzBuzz
1. DecimalConverter
    - 与えられた10進数の整数を2進数, 8進数, 10進数, 16進数で返す
1. Triangle
    - 与えられた3つの整数の組でできる三角形の形状(正三角形など)を返す
1. Person
    - オブジェクト指向プログラミングの問題。与えられた性別と名前に応じた挨拶(Say hello)をしてくる。
    
# Prerequisites
1. Git
1. Java
1. Maven
1. Eclipse or IntelliJ (Optional,but strong recommendation)

# How to Do

- Clone and Compile

```
 $ cd workspace
 $ git clone git@github.com:tsukakei/autoput-example.git
 $ cd autoput-example
 $ mvn compile test-compile dependency:copy-dependenices 
``` 

- Change Git Branch

```
 $ git checkout -b yourname
```

- Implement

You get 10 minutes for each project. 


- Run Test Cases

```
 $ sh/run.sh FizzBuzz CUT test
 $ sh/run.sh DecimalConverter CUT test
 $ sh/run.sh Triangle CUT test
 $ sh/run.sh Person CUT test
 
 $ sh/run.sh FizzBuzz PUT test
 $ sh/run.sh DecimalConverter PUT test
 $ sh/run.sh Triangle PUT test
 $ sh/run.sh Person PUT test
```

- Measure coverage

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
    
- See Coverage Report
```
 $ open target/site/jacoco/index.html
```

- Push Your Work

```
 $ git commit -m "User experiment: Your Name"
 $ git push origin yourname
```