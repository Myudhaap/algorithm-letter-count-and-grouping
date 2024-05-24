package Services;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Question1Service {
  public static Map<String, Integer> countLetter(String text){
    Map<String, Integer> res = new LinkedHashMap<>();

    for(String c: Arrays.stream(text.replaceAll("\\s+", "").split("")).map(String::toLowerCase).toList()){
      if(res.containsKey(c)){
        res.put(c, res.get(c) + 1);
      }else{
        res.put(c, 1);
      }
    }

    return res;
  }
}
