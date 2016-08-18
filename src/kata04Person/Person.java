package kata04Person;

/**
 * Created by Alenka on 08.08.2016.
 */
public class Person {
    String name;

    public Person(String personName) {
        name = personName;
    }

    public String greet(String yourName) {
        return String.format("Hi %s, my name is %s", yourName, name);
    }
}