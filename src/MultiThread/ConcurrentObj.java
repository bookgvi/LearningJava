package MultiThread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentObj {
  private static ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
  private static Map<Integer, String> hm = new HashMap<>();

  public static Map<Integer, String> getMap(boolean isConcurrentHashMap) {
    return isConcurrentHashMap ? chm : hm;
  }
}
