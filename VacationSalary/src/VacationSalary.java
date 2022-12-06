import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class VacationSalary {
    public static void main(String[] args) {
        /*  Environments. 
            workMonths - how much months you works, restDays - how much days you gonna rest, 
            result = your rest salary, sum - sum of your all salaryes for month */
        int workMonths, restDays, result;
        int sum = 0;

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("How much months do you work in this organization?: ");
            workMonths = in.nextInt();
            // Array salary for salary per month
            List<Integer> salary = new ArrayList<Integer>(workMonths);
            System.out.println("Enter your salary per month: ");
            for (int i = 0; i < workMonths; i++) {
                salary.add(i, in.nextInt()); 
                sum = sum + salary.get(i);
            }
            System.out.printf("Your sum of salary is %d", sum);
            System.out.println();
            System.out.print("How much days you go to rest?: ");
            restDays = in.nextInt();
        }
        System.out.println();
        // Results 
        result = ((sum/workMonths)/30) * restDays;
        System.out.printf("Result is %d", result); 
        
    }
}