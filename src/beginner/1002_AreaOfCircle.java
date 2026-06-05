package beginner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double R = sc.nextDouble();
        Double A = 3.14159 * Math.pow(R, 2);

        System.out.printf("A=%.4f\n", A);

        sc.close();

    }
}