package LearningString;

public class LearningStringClass {
    public void getSome() {
        java.lang.String s1 = new String("1");
        Boolean expr = s1 == "1";
//        Boolean expr = s1.intern() == "1";
        System.out.printf("Hash s1 = %s, hash \"1\" = %s", s1.hashCode(), "1".hashCode());
        System.out.printf("\n%s", expr);
    }
}
