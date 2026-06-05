package beginner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class P1009_SalaryWithBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sellerName = sc.nextLine();
        BigDecimal fixedSalary = sc.nextBigDecimal();
        BigDecimal salesTotal = sc.nextBigDecimal();

        BigDecimal commission = salesTotal.multiply(new BigDecimal("0.15"));
        BigDecimal finalSalary = fixedSalary.add(commission);

        System.out.println("TOTAL = R$ " + finalSalary.setScale(2, RoundingMode.HALF_UP));

        sc.close();
    }
}