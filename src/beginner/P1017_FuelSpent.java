package beginner;

import java.util.Scanner;

public class P1017_FuelSpent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double time = sc.nextDouble();
        double speed = sc.nextDouble();
        double liters = (speed * time) / 12;

        System.out.printf("%.3f\n", liters);

        sc.close();
    }
}
