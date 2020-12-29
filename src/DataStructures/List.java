package DataStructures;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class List {
    TreeMap tm;
    HashMap hm;
    ArrayList<String> list;

    public List() {
        this.list = new ArrayList<String>();
    }

    public void display() {
        this.list.add("A");
        this.list.add("B");
        this.list.add("C");
        this.list.add("D");
        for (String l: this.list) {
            System.out.println(l);
        }
    }
}
