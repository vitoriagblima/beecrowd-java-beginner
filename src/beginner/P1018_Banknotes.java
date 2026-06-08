package beginner;

import java.util.Scanner;
import java.util.Locale;

public class P1018_Banknotes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("pt", "BR"));

        int value = sc.nextInt();
        int original = value;

        int[] notes = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(original);

        for (int i = 0; i < notes.length; i++) {

            int quantity = value / notes[i];
            value = value % notes[i];

            System.out.printf("%d nota(s) de R$ %.2f%n",
                    quantity, notes[i] * 1.0);
        }

        sc.close();
    }
}