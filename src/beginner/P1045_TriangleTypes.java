package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class P1045_TriangleTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] v = new double[3];

        v[0] = sc.nextDouble();
        v[1] = sc.nextDouble();
        v[2] = sc.nextDouble();

        Arrays.sort(v);

        double A = v[2];
        double B = v[1];
        double C = v[0];

        double A2 = A * A;
        double B2 = B * B;
        double C2 = C * C;

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }

        if (A2 == B2 + C2)
            System.out.println("TRIANGULO RETANGULO");
        else if (A2 > B2 + C2)
            System.out.println("TRIANGULO OBTUSANGULO");
        else
            System.out.println("TRIANGULO ACUTANGULO");

        if (A == B && B == C)
            System.out.println("TRIANGULO EQUILATERO");
        else if (A == B || A == C || B == C)
            System.out.println("TRIANGULO ISOSCELES");

        sc.close();
    }
}