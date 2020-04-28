import DataStructures.List;
import DataStructures.HashTable;

public class Program {
    public static void main(String[] args) {
        List l = new List();
        HashTable ht = new HashTable();
        System.out.println(ht.setHashSet("1"));
        System.out.println(ht.setHashSet("1"));
        ht.setHashSet("2");
        ht.setHashSet("3");
        ht.setHashSet("4");
        ht.setHashSet("5");
        System.out.println(ht.getHashSet());
    }
}
