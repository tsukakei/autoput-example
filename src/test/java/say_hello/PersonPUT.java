package say_hello;

import org.junit.Assert;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class PersonPUT {
    private static Object[] INPUT0    = { Person.Sex.FEMALE, "Alice"};
    private static String   EXPECTED0 = "Hello, I am Ms. Alice.";
    // Y.Mao
    private static Object[] INPUT1    = { Person.Sex.MALE, "Bob"};
    private static String   EXPECTED1 = "Hello, I am Mr. Bob.";
    private static Object[] INPUT2    = { Person.Sex.MALE, "Tim"};
    private static String   EXPECTED2 = "Hello, I am Mr. Tim.";
    private static Object[] INPUT3    = { Person.Sex.FEMALE, "Lily"};
    private static String   EXPECTED3 = "Hello, I am Ms. Lily.";
    private static Object[] INPUT4    = { Person.Sex.MALE, "Kobe"};
    private static String   EXPECTED4 = "Hello, I am Mr. Kobe.";
    private static Object[] INPUT5    = { Person.Sex.MALE, "Tmac"};
    private static String   EXPECTED5 = "Hello, I am Mr. Tmac.";
    private static Object[] INPUT6    = { Person.Sex.MALE, "Duncan"};
    private static String   EXPECTED6 = "Hello, I am Mr. Duncan.";
    private static Object[] INPUT7    = { Person.Sex.MALE, "Parker"};
    private static String   EXPECTED7 = "Hello, I am Mr. Parker.";
    // S.Saruwatari
    private static Object[] INPUT8    = { Person.Sex.MALE, "Bob"};
    private static String   EXPECTED8 = "Hello, I am Mr. Bob.";
    private static Object[] INPUT9    = { Person.Sex.FEMALE, ""};
    private static String   EXPECTED9 = "Hello, I am Ms. .";
    private static Object[] INPUT10    = { Person.Sex.MALE, " "};
    private static String   EXPECTED10 = "Hello, I am Mr.  .";


    @DataPoints
    public static Fixture[] TestData = {
            new Fixture(EXPECTED0, INPUT0),   // TestData[0]
            new Fixture(EXPECTED1, INPUT1),   // TestData[1]
            new Fixture(EXPECTED2, INPUT2),   // TestData[2]
            new Fixture(EXPECTED3, INPUT3),   // TestData[3]
            new Fixture(EXPECTED4, INPUT4),   // TestData[4]
            new Fixture(EXPECTED5, INPUT5),   // TestData[5]
            new Fixture(EXPECTED6, INPUT6),   // TestData[6]
            new Fixture(EXPECTED7, INPUT7),   // TestData[7]
            new Fixture(EXPECTED8, INPUT8),   // TestData[8]
            new Fixture(EXPECTED9, INPUT9),   // TestData[9]
            new Fixture(EXPECTED10, INPUT10), // TestData[10]
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
