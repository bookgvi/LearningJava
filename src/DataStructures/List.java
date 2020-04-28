package DataStructures;

import java.util.ArrayList;

public class List {
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
