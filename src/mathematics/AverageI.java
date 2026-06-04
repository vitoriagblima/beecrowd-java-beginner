package mathematics;

import java.util.Scanner;

public class AverageI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double A = sc.nextDouble();
        Double B = sc.nextDouble();

        Double media = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", media);

        sc.close();
    }

}
