package Utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Util {
  public static<T, V> void printMap(Map<T, V> map){
    System.out.println(Arrays.toString(map.entrySet().toArray()).replaceAll("[\\[\\]]","\""));
  }

  public static void printList(List<String> list){
    System.out.println("\"" + String.join("",list) + "\"");
  }
}
