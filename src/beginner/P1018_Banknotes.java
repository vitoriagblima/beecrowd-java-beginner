package beginner;

import java.util.Scanner;

public class P1018_Banknotes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int n = valor;

        int nota100 = n / 100;
        n %= 100;

        int nota50 = n / 50;
        n %= 50;

        int nota20 = n / 20;
        n %= 20;

        int nota10 = n / 10;
        n %= 10;

        int nota5 = n / 5;
        n %= 5;

        int nota2 = n / 2;
        n %= 2;

        int nota1 = n;

        System.out.println(valor);
        System.out.printf("%d nota(s) de R$ 100,00%n", nota100);
        System.out.printf("%d nota(s) de R$ 50,00%n", nota50);
        System.out.printf("%d nota(s) de R$ 20,00%n", nota20);
        System.out.printf("%d nota(s) de R$ 10,00%n", nota10);
        System.out.printf("%d nota(s) de R$ 5,00%n", nota5);
        System.out.printf("%d nota(s) de R$ 2,00%n", nota2);
        System.out.printf("%d nota(s) de R$ 1,00%n", nota1);

        sc.close();
    }
}