package say_hello;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class PersonPUT {
    private static String   EXPECTED1 = "Hello, I am Ms. Alice.";
    private static Object[] INPUT1    = { Person.Sex.FEMALE, "Alice"};

    private static String   EXPECTED_W_1 = "Hello, I am Ms. Jane.";
    private static Object[] INPUT_W_1    = { Person.Sex.FEMALE, "Jane"};
    private static String   EXPECTED_W_2 = "Hello, I am Ms. .";
    private static Object[] INPUT_W_2    = { Person.Sex.FEMALE, ""};
    private static String   EXPECTED_W_3 = "Hello, I am Ms. 佐藤.";
    private static Object[] INPUT_W_3    = { Person.Sex.FEMALE, "佐藤"};
    private static String   EXPECTED_W_4 = "Hello, I am Ms. null.";
    private static Object[] INPUT_W_4    = { Person.Sex.FEMALE, null};

    private static String   EXPECTED_M_1 = "Hello, I am Mr. Bob.";
    private static Object[] INPUT_M_1    = { Person.Sex.MALE, "Bob"};
    private static String   EXPECTED_M_2 = "Hello, I am Mr. .";
    private static Object[] INPUT_M_2    = { Person.Sex.MALE, ""};
    private static String   EXPECTED_M_3 = "Hello, I am Mr. 田中.";
    private static Object[] INPUT_M_3    = { Person.Sex.MALE, "田中"};
    private static String   EXPECTED_M_4 = "Hello, I am Mr. null.";
    private static Object[] INPUT_M_4    = { Person.Sex.MALE, null};

    @DataPoints
    public static Fixture[] TestData = {
        new Fixture(EXPECTED1, INPUT1),
        new Fixture(EXPECTED_W_1, INPUT_W_1),
        new Fixture(EXPECTED_W_2, INPUT_W_2),
        new Fixture(EXPECTED_W_3, INPUT_W_3),
        new Fixture(EXPECTED_W_4, INPUT_W_4),
        new Fixture(EXPECTED_M_1, INPUT_M_1),
        new Fixture(EXPECTED_M_2, INPUT_M_2),
        new Fixture(EXPECTED_M_3, INPUT_M_3),
        new Fixture(EXPECTED_M_4, INPUT_M_4),
    };

    @Theory
    public void testSayHello(Fixture fixture) {
        Person.Sex sex = (Person.Sex) fixture._input[0];
        String name = (String) fixture._input[1];
        Person person = new Person(sex, name);
        Assert.assertEquals(fixture._expected, person.sayHello());
    }

    static class Fixture {
        private String   _expected;
        private Object[] _input;
        Fixture(String _expected, Object[] _input) {
            this._expected = _expected;
            this._input    = _input;
        }
    }
}
