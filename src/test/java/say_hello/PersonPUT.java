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
    private static String   EXPECTED2 = "Hello, I am Mr. Bob.";
    private static Object[] INPUT2    = { Person.Sex.MALE, "Bob"};
    private static String   EXPECTED3 = "Hello, I am Ms. Arisa.";
    private static Object[] INPUT3    = { Person.Sex.FEMALE, "Arisa"};
    private static String   EXPECTED4 = "Hello, I am Mr. Mike.";
    private static Object[] INPUT4    = { Person.Sex.MALE, "Mike"};


    @DataPoints
    public static Fixture[] TestData = {
        new Fixture(EXPECTED1, INPUT1), // Data
        new Fixture(EXPECTED2, INPUT2), // Data
        new Fixture(EXPECTED3, INPUT3), // Data
        new Fixture(EXPECTED4, INPUT4), // Data
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
