package fizzbuzz;

public class FizzBuzz {
    public static String fizzbuzz(int i) {
        if (i <= 0) {
            return null;
        }
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }
}
