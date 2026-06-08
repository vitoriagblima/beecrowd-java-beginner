package beginner;

import java.util.Scanner;

public class P1038_Snack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        double value = 0;

        if (X == 1){
            value = 4.00 * Y;
        } else if (X == 2){
            value = 4.50 * Y;
        } else if (X == 3){
            value = 5.00 * Y;
        } else if (X == 4){
            value = 2.00 * Y;
        } else if (X == 5){
            value = 1.50 * Y;
        } else{
            System.out.println("Código inválido");
        }
        
        System.out.printf("Total: R$ %.2f\n", value);

        sc.close();
    }
}
