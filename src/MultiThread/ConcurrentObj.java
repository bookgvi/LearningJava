package MultiThread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentObj {
  private ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
  private Map<Integer, String> hm = new HashMap<>();

  public ConcurrentHashMap<Integer, String> getChm() {
    return chm;
  }

  public Map<Integer, String> getHm() {
    return hm;
  }
}
