package DataStructures;

import java.util.Set;
import java.util.HashSet;

public class HashTable {
    private Set<String> l;
    public HashTable() {
        this.l = new HashSet<String>();
    }

    public Boolean setHashSet(String str) {
        try {
            return this.l.add(str);
        } catch (Exception e) {
            throw e;
        }
    }

    public Set<String> getHashSet() {
        return this.l;
    }
}
