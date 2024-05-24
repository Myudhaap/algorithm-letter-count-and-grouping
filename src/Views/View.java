package Views;

import java.util.Scanner;

public class View {
  public static void run(){
    Scanner scanner = new Scanner(System.in);

    while(true){
      System.out.println("============================================");
      System.out.println("--------------------MENU--------------------");
      System.out.println("1. Question 1 Letter Count");
      System.out.println("2. Question 2 Group Letter");
      System.out.println("3. Exit");
      System.out.println("--------------------------------------------");
      System.out.println("============================================");

      System.out.print("Enter menu: ");
      String menu = scanner.nextLine();

      switch (menu){
        case "1":
          ViewQuestion1.run();
          break;
        case "2":
          ViewQuestion2.run();
          break;
        case "3":
          System.exit(0);
          break;
        default:
          System.err.println("Menu not available");
          break;
      }
    }
  }
}
