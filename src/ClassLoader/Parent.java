package ClassLoader;

public class Parent {
    public static final String name = "Parent Name";
    public static String name1 = "not final Parent Name";
    static {
        System.out.println("Parent static block initialized");
    }
}
