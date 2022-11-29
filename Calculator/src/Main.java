import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator app = new Calculator();
        char operation;
        System.out.println("===-ДОБРО ПОЖАЛОВАТЬ В КАЛЬКУЛЯТОР-===");
        System.out.println("===-ВЫ МОЖЕТЕ ИСПОЛЬЗОВАТЬ ТОЛЬКО 2 ЧИСЛА-===");
        System.out.println("===-ВВЕДИТЕ, ЧТО ВЫ ХОТИТЕ СДЕЛАТЬ С ЭТИМИ ЧИСЛАМИ-===");
        System.out.println("===-ИСПОЛЬЗУЙТЕ СИМВОЛЫ + - * / -===");
        Scanner in = new Scanner(System.in);
        operation = in.next().charAt(0);

        switch (operation) {
            case '+': app.operationPlus(); break;
            case '-': app.operationMinus(); break;
            case '*': app.operationMultiplication(); break;
            case '/': app.operationDivision(); break;
            default: System.out.println(" ОШИБКА. ИСПОЛЬЗУЙТЕ ТОЛЬКО: + - / * ");
        }
    }
}