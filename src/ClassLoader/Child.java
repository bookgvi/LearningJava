package ClassLoader;

public class Child extends Parent {
    static {
        System.out.println("Child static block initialized");
    }
}
