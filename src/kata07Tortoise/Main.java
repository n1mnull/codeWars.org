package kata07Tortoise;

/**
 * Created by Alenka on 11.08.2016.
 */
public class Main {
    String variable;
    public static void main(String[] args) {
        System.out.println("Hello World!");
        B b = new B();
    }

    public Main(){
        printVariable();
    }

    protected void printVariable(){
        variable = "variable is initialized in Main Class";
    }
}

class B extends Main {
    String variable = null;

    public B(){
        System.out.println("variable value = " + variable);
    }

    protected void printVariable(){
        variable = "variable is initialized in B Class";
    }
}
