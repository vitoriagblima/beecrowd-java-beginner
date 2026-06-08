package beginner;

import java.util.Scanner;

public class P1002_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();
        double A = 3.14159 * Math.pow(R, 2);

        System.out.printf("A=%.4f\n", A);

        sc.close();

    }
}