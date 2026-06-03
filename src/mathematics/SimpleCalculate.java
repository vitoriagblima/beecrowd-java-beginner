package mathematics;

import java.math.BigDecimal;
import java.util.Scanner;

public class SimpleCalculate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codeOne = sc.nextInt();
        int qtdOne = sc.nextInt();
        BigDecimal priceOne = sc.nextBigDecimal();

        int codeTwo = sc.nextInt();
        int qtdTwo = sc.nextInt();
        BigDecimal priceTwo = sc.nextBigDecimal();

        BigDecimal totalOne = priceOne.multiply(BigDecimal.valueOf(qtdOne));
        BigDecimal totalTwo = priceTwo.multiply(BigDecimal.valueOf(qtdTwo));

        BigDecimal total = totalOne.add(totalTwo);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}