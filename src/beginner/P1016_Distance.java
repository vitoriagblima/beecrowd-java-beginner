package beginner;

import java.util.Scanner;

public class P1016_Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        int t = 2 * distance;

        System.out.printf("%d minutos\n", t);

        sc.close();
    }
}
