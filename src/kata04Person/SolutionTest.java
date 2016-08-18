package kata04Person;

/**
 * Created by Alenka on 08.08.2016.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void testSomething() {
        Person personJim = new Person("Jim");
        assertEquals("Hi Tomas, my name is Jim", personJim.greet("Tomas"));
    }
}