package beginner;

import java.util.Scanner;

public class P1014_Consumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();

        double total = X / Y;

        System.out.printf("%.3f km/l\n", total);

        sc.close();
    }
}
