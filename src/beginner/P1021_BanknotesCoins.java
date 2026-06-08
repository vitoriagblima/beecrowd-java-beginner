package beginner;

import java.util.Scanner;

public class P1021_BanknotesCoins {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();

        // convert to cents (avoids floating point precision errors)
        int totalCents = (int) Math.round(value * 100);

        int[] banknotes = {10000, 5000, 2000, 1000, 500, 200};
        int[] coins = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");

        for (int i = 0; i < banknotes.length; i++) {
            int quantity = totalCents / banknotes[i];
            totalCents = totalCents % banknotes[i];

            System.out.printf("%d nota(s) de R$ %.2f%n",
                    quantity, banknotes[i] / 100.0);
        }

        System.out.println("MOEDAS:");

        for (int i = 0; i < coins.length; i++) {
            int quantity = totalCents / coins[i];
            totalCents = totalCents % coins[i];

            System.out.printf("%d moeda(s) de R$ %.2f%n",
                    quantity, coins[i] / 100.0);
        }

        sc.close();
    }
}