import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Calculator app = new Calculator();
      char operation;
      float app_num1, app_num2;

      app_num1 = app.getNum1();
      app_num2 = app.getNum2();

      System.out.println("====== Welcome to Calculator APP ======");
      System.out.println("=== You can choose only two numbers ===");
      app.setNumbers();

      System.out.println("=========== Select an action ===========");
      System.out.println("Plus (+), Minus (-), Multiplication (*), Division (/)");
      Scanner in = new Scanner(System.in);
      operation = in.next().charAt(0);

      switch(operation) {
        case '+': app.operationPlus(); break;
        case '-': app.operationMinus(); break;
        case '*': app.operationMultiplication(); break;
        case '/': app.operationDivision(); break;
        default: System.out.println("Error... Try again!"); break;
      }
    }
}