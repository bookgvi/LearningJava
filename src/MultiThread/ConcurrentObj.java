package MultiThread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentObj {
  private ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
  private Map<Integer, String> hm = new HashMap<>();

  public Map<Integer, String> getMap(boolean isConcurrentHashMap) {
    return isConcurrentHashMap ? chm : hm;
  }
}
