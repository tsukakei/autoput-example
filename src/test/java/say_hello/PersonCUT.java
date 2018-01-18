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
    @Test
    public void testSayHello2() {
        Person person = new Person(Person.Sex.MALE, "Bob");
        String expected = "Hello, I am Mr. Bob.";
        Assert.assertEquals(expected, person.sayHello());
    }
    @Test
    public void testSayHello3() {
        Person person = new Person(Person.Sex.FEMALE, "");
        String expected = "Hello, I am Ms. .";
        Assert.assertEquals(expected, person.sayHello());
    }
    @Test
    public void testSayHello4() {
        Person person = new Person(Person.Sex.MALE, " ");
        String expected = "Hello, I am Mr.  .";
        Assert.assertEquals(expected, person.sayHello());
    }
}
