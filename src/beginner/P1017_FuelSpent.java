package beginner;

import java.util.Scanner;

public class P1017_FuelSpent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double time = sc.nextDouble();
        Double speed = sc.nextDouble();
        Double liters = (speed * time) / 12;

        System.out.printf("%.3f\n", liters);

        sc.close();
    }
}
