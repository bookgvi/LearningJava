package DataStructures;

import java.util.HashSet;
import java.util.Set;

interface ISet {
  Set<Integer> initSet(int count);
}

public class SetClass implements ISet {
  private Set<Integer> set;

  public SetClass (int count) {
    set = this.initSet(count);
  }

  public Set<Integer> initSet (int count) {
    Set<Integer> _set = new HashSet<>();
    for (int i = 0; i <= count; i++) {
      _set.add(i);
    }
    return _set;
  }

  public Set<Integer> getSet() {
    return set;
  }

  public void setSet(int a) {
    set.add(a);
  }
}
