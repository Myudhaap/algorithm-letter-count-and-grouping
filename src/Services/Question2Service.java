package Services;

import Utils.Util;

import java.util.*;

public class Question2Service {
  public static Map<String, Integer> groupLetter(List<String> words) {
    Map<String, Integer> resMap = new LinkedHashMap<>();

    for(String word: words){
      countLetter(resMap, word);
    }

    resMap = sortingLetter(resMap);

    return resMap;
  }

  private static void countLetter(Map<String, Integer> resMap, String word){
    for(String c: word.replaceAll("\\s+", "").split("")){
      if(resMap.containsKey(c)){
        resMap.put(c, resMap.get(c) + 1);
      }else{
        resMap.put(c, 1);
      }
    }
  }

  private static Map<String, Integer> sortingLetter(Map<String, Integer> resMap){
    List<Map.Entry<String, Integer>> listMap = new ArrayList<>(resMap.entrySet());
    Map<String, Integer> sortedMap = new LinkedHashMap<>();

    while(true) {
      int counter = 0;

      for (int i = 0; i < listMap.size() - 1; i++) {
        Map.Entry<String, Integer> temp = listMap.get(i);

        if (listMap.get(i).getValue() < listMap.get(i + 1).getValue()) {
          listMap.set(i, listMap.get(i + 1));
          listMap.set(i + 1, temp);

          counter++;
        } else if (listMap.get(i).getKey().compareTo(listMap.get(i + 1).getKey()) > 0 && listMap.get(i).getValue() == listMap.get(i + 1).getValue()) {
          listMap.set(i, listMap.get(i + 1));
          listMap.set(i + 1, temp);

          counter++;
        }
      }

      if (counter == 0) {
        for (Map.Entry<String, Integer> kvp : listMap) {
          sortedMap.put(kvp.getKey(), kvp.getValue());
        }
        break;
      }
    }

    return sortedMap;
  }
}
