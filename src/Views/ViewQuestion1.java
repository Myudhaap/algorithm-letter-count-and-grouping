package Views;

import Services.Question1Service;
import Utils.Util;

import java.util.Map;
import java.util.Scanner;

public class ViewQuestion1 {
  public static void run(){
    try{
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter text ex(We Always Mekar): ");
      String input = scanner.nextLine();

      if(input.isBlank()) throw new NullPointerException("Input cant blank");

      Map<String, Integer> res = Question1Service.countLetter(input);
      Util.printMap(res);
    }catch (NullPointerException e){
      System.err.println(e.getMessage());
    }
  }
}
