package beginner;

import java.util.Scanner;

public class P1011_Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double R = sc.nextDouble();
        Double vol = ((4.0/3) * 3.14159) * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f\n", vol);
    }
}
