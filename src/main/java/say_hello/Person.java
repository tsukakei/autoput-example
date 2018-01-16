package say_hello;

public class Person {
    public enum Sex {
        MALE,
        FEMALE
    }

    private Sex sex;
    private String name;

    public Person (Sex sex, String name) {
        this.sex  = sex;
        this.name = name;
    }

    public String sayHello() {
        String prefix = (this.sex.equals(Sex.MALE)) ? "Mr." : "Ms.";
        return "Hello, I am " + prefix + " " + this.name + ".";
    }
}
