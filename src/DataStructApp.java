import DataStructures.List;
import DataStructures.HashTable;
import DataStructures.SetClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class DataStructApp {
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

        SetClass sc = new SetClass(5);
        System.out.println("Hash Set has been initialized successfully... " + sc.getSet());
        for (Integer s: sc.getSet()) {
            System.out.println(s);
        }
    }
}
