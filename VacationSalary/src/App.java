import java.util.Scanner;
import java.lang.String;

public class App {
    public static void main(String[] args) {
        int m;
        Scanner howMuchMonths = new Scanner(System.in);
        System.out.print("How much month's do you work in this organization?: ");
        m = howMuchMonths.nextInt();
        int salary[] = new int[m];
        
        System.out.println("Enter your salary for month: ");
        for (int i = 0; i < m; i++) {
            Scanner salaryForMonth = new Scanner(System.in);
            salary[i] = salaryForMonth.nextInt();
        }

        int salarySum = 0;
        for (int i=0; i < m; i++) {
            salarySum = salarySum + salary[i];
        }
        System.out.print("Your salary sum for all months is: " + salarySum);
        System.out.println();

        int vacationDays;
        System.out.print("How much days u have to vacation?: ");
        Scanner howMuchDays = new Scanner(System.in);
        vacationDays = howMuchDays.nextInt();
        System.out.println();

        int result;
        result = ((salarySum/m)/29) * vacationDays;
        System.out.print("Result: " + result);
    }
}
