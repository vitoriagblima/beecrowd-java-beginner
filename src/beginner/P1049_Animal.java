package beginner;

import java.util.Scanner;

public class P1049_Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = sc.nextLine();
        String two = sc.nextLine();
        String three = sc.nextLine();

        switch (one + " " + two + " " + three) {
            case "vertebrado ave carnivoro":
                System.out.println("aguia");
                break;
            case "vertebrado ave onivoro":
                System.out.println("pomba");
                break;
            case "vertebrado mamifero onivoro":
                System.out.println("homem");
                break;
            case "vertebrado mamifero herbivoro":
                System.out.println("vaca");
                break;
            case "invertebrado inseto hematofago":
                System.out.println("pulga");
                break;
            case "invertebrado inseto herbivoro":
                System.out.println("lagarta");
                break;
            case "invertebrado anelideo hematofago":
                System.out.println("sanguessuga");
                break;
            case "invertebrado anelideo onivoro":
                System.out.println("minhoca");
                break;
        }

        sc.close();
    }
}