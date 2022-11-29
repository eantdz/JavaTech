import java.lang.String;
import java.util.Scanner;

public class Calculator {
    int num1, num2, result;
    char operation;

    void operationPlus() {
        System.out.println("===-ВВЕДИТЕ 2 ЧИСЛА-===");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        result = num1 + num2; 
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    void operationMinus() {
        System.out.println("===-ВВЕДИТЕ 2 ЧИСЛА-===");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        result = num1 - num2; 
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    void operationMultiplication() {
        System.out.println("===-ВВЕДИТЕ 2 ЧИСЛА-===");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        result = num1 * num2; 
        System.out.println(num1 + " * " + num2 + " = " + result);
    }

    void operationDivision() {
        System.out.println("===-ВВЕДИТЕ 2 ЧИСЛА-===");
        Scanner in = new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        result = num1 / num2; 
        System.out.println(num1 + " : " + num2 + " = " + result);
    }
}