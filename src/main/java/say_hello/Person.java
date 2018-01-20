package say_hello;

public class Person {

    static final int MALE = 1;
    static final int FEMALE = 2;

    private int sex;
    private String name;

    public Person (int sex, String name) {
        this.sex  = sex;
        this.name = name;
    }

    public String sayHello() {
        String prefix = (this.sex == MALE) ? "Mr." : "Ms.";
        return "Hello, I am " + prefix + " " + this.name + ".";
    }
}
