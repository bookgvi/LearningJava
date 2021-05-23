package tmp_DDD;

public class Parent {
    protected String _str1;
    protected Tenant _tenant;
    Parent(Tenant tenant, String str1) {
        _str1 = str1;
        _tenant = tenant;
    }
}
