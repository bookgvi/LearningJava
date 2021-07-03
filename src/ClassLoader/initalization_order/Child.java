package ClassLoader.initalization_order;

public class Child extends Parent {
    static {
        System.out.println("Child static init");
    }

    public static String staticMethod() {
        return "invoked staticMethod of Child class";
    }

    public void nonStaticMethod() {
        System.out.println("invoked nonStaticMethod of Child class");
    }

}
