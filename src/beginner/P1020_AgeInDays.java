package beginner;

import java.util.Scanner;

public class P1020_AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageDays = sc.nextInt();
        int year = ageDays / 365;
        int remainingDays = ageDays % 365;
        int month = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.printf("%d ano(s)\n", year);
        System.out.printf("%d mes(es)\n", month);
        System.out.printf("%d dia(s)\n", days);

        sc.close();
    }
}