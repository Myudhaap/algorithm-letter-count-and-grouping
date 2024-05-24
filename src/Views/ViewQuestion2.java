package Views;

import Services.Question2Service;
import Utils.Util;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ViewQuestion2 {
  public static void run(){
    try{
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter texts with ',' divider ex(Abc,bCd): ");
      String input = scanner.nextLine();

      if(input.isBlank()) throw new NullPointerException("Input cant blank");

      List<String> inputList = Arrays.stream(input.split(",")).toList();
      Map<String, Integer> res = Question2Service.groupLetter(inputList);

      Util.printMap(res);
      Util.printList(res.keySet().stream().toList());
    }catch (NullPointerException | ArrayStoreException e){
      System.err.println(e.getMessage());
    }
  }
}
