package ClassLoader.initalization_order;

public class Parent {
    static {
        System.out.println("Parent static init");
    }

    public static String staticMethod() {
        return "invoked staticMethod of Parent class";
    }

    public void nonStaticMethod() {
        System.out.println("invoked nonStaticMethod of Parent class");
    }
}
