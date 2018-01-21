package say_hello;

import org.junit.Assert;
import org.junit.Test;

public class PersonCUT {
    @Test
    public void testSayHello1() {
        Person person = new Person(Person.Sex.FEMALE, "Alice");
        String expected = "Hello, I am Ms. Alice.";
        Assert.assertEquals(expected, person.sayHello());
    }
}
