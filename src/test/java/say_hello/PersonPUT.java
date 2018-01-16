package say_hello;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class PersonPUT {
    private static String   EXPECTED1 = "Hello, I am Ms. Alice.";
    private static String   EXPECTED2 = "Hello, I am Mr. Bob.";
    private static String   EXPECTED3 = "Hello, I am Mr. Carl.";
    private static String   EXPECTED4 = "Hello, I am Ms. Dave.";
    private static String   EXPECTED5 = "Hello, I am Mr. Edward.";
    private static String   EXPECTED6 = "Hello, I am Mr. Freddie.";
    private static String   EXPECTED7 = "Hello, I am Mr. George.";
    private static String   EXPECTED8 = "Hello, I am Mr. .";
    private static String   EXPECTED9 = "Hello, I am Ms. null.";
    private static Object[] INPUT1    = { Person.Sex.FEMALE, "Alice"};
    private static Object[] INPUT2    = { Person.Sex.MALE, "Bob" };
    private static Object[] INPUT3    = { Person.Sex.MALE, "Carl" };
    private static Object[] INPUT4    = { Person.Sex.FEMALE, "Dave" };
    private static Object[] INPUT5    = { Person.Sex.MALE, "Edward" };
    private static Object[] INPUT6    = { Person.Sex.MALE, "Freddie" };
    private static Object[] INPUT7    = { Person.Sex.MALE, "George" };
    private static Object[] INPUT8    = { Person.Sex.MALE, "" };
    private static Object[] INPUT9    = { Person.Sex.FEMALE, null };

    @DataPoints
    public static Fixture[] TestData = {
        new Fixture(EXPECTED1, INPUT1), // Data1
        new Fixture(EXPECTED2, INPUT2), // Data2
        new Fixture(EXPECTED3, INPUT3), // Data3
        new Fixture(EXPECTED4, INPUT4), // Data4
        new Fixture(EXPECTED5, INPUT5), // Data5
        new Fixture(EXPECTED6, INPUT6), // Data6
        new Fixture(EXPECTED7, INPUT7), // Data7
        new Fixture(EXPECTED8, INPUT8), // Data8
        new Fixture(EXPECTED9, INPUT9), // Data9
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
