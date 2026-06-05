package beginner;

import java.util.Scanner;

public class P1015_DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double x1 = sc.nextDouble();
        Double y1 = sc.nextDouble();
        Double x2 = sc.nextDouble();
        Double y2 = sc.nextDouble();

        Double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distancia);

        sc.close();
    }
}
