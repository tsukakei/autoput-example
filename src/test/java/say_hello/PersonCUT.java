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
    // Y.Mao
    @Test
    public void testSayHello2() {
        Person person = new Person(Person.Sex.MALE, "Bob");
        String expected = "Hello, I am Mr. Bob.";
        Assert.assertEquals(expected, person.sayHello());
    }
    @Test
    public void testSayHello3() {
        Person person = new Person(Person.Sex.MALE, "Tim");
        String expected = "Hello, I am Mr. Tim.";
        Assert.assertEquals(expected, person.sayHello());
    }
    @Test
    public void testSayHello4() {
        Person person = new Person(Person.Sex.FEMALE, "Lily");
        String expected = "Hello, I am Ms. Lily.";
        Assert.assertEquals(expected, person.sayHello());
    }
    @Test
    public void testSayHello5() {
        Person person = new Person(Person.Sex.MALE, "Kobe");
        String expected = "Hello, I am Mr. Kobe.";
        Assert.assertEquals(expected, person.sayHello());
    }
    @Test
    public void testSayHello6() {
        Person person = new Person(Person.Sex.MALE, "Tmac");
        String expected = "Hello, I am Mr. Tmac.";
        Assert.assertEquals(expected, person.sayHello());
    }
    @Test
    public void testSayHello7() {
        Person person = new Person(Person.Sex.MALE, "Duncan");
        String expected = "Hello, I am Mr. Duncan.";
        Assert.assertEquals(expected, person.sayHello());
    }
    @Test
    public void testSayHello8() {
        Person person = new Person(Person.Sex.MALE, "Parker");
        String expected = "Hello, I am Mr. Parker.";
        Assert.assertEquals(expected, person.sayHello());
    }
}
