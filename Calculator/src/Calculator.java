import java.util.Scanner;

class Calculator {
    private float num1, num2, result;
    
    void setNumbers() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.println();

        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
    }

    float getNum1() {
        return num1;
    }

    float getNum2() {
        return num2;
    }

    void operationPlus() {
        result = num1 + num2;
        System.out.print("Result: " + result);
    }

    void operationMinus() {
        result = num1 - num2;
        System.out.print("Result: " + result);
    }

    void operationMultiplication() {
        result = num1 * num2;
        System.out.print("Result: " + result);
    }
    
    void operationDivision() {
        result = num1 / num2;
        System.out.print("Result: " + result);
    }
}