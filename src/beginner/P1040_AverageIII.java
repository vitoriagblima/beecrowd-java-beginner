package beginner;

import java.util.Scanner;

public class P1040_AverageIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // float is used because the grades and averages can contain decimal values.
        float N1 = sc.nextFloat();
        float N2 = sc.nextFloat();
        float N3 = sc.nextFloat();
        float N4 = sc.nextFloat();

        float average = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        System.out.printf("Media: %.1f%n", average);

        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");

            float examGrade = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", examGrade);

            float finalAverage = (average + examGrade) / 2;

            if (finalAverage >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", finalAverage);
        }

        sc.close();
    }
}