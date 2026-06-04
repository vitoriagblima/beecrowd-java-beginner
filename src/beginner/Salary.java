package beginner;

import java.math.BigDecimal;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeNumber = sc.nextInt();
        BigDecimal workedHours = sc.nextBigDecimal();
        BigDecimal hourlyRate = sc.nextBigDecimal();
        BigDecimal salary = workedHours.multiply(hourlyRate);

        System.out.println("NUMBER = " + employeeNumber);
        System.out.println("SALARY = U$ " + salary.setScale(2));

        sc.close();
    }
}