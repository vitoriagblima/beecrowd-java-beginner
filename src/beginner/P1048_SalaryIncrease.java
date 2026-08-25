package beginner;

import java.util.Locale;
import java.util.Scanner;

public class P1048_SalaryIncrease{
    public static void main(String [] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sal = sc.nextDouble();
        double percentual = 0;
    
        if (sal <= 400.00){
            percentual = 15;
        } else if (sal <= 800.00){
            percentual = 12;
        } else if (sal <= 1200.00){
            percentual = 10;
        } else if (sal <= 2000.00){
            percentual = 7;
        } else if (sal > 2000.00){
            percentual = 4;
        } else {
            System.out.println("Digite um valor válido.");
        }

        double reajuste = sal * (percentual / 100);
        double novoSalario = sal + reajuste;

        System.out.printf("Novo salário: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %.0f %%%n", percentual);
        sc.close();
    }
}