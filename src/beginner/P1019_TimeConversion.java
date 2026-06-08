package beginner;

import java.util.Scanner;

public class P1019_TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int hours   = num / 3600;
        int minutes = (num % 3600) / 60;
        int seconds = num % 60;

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);

        sc.close();
    }
}
