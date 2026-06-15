package beginner;

import java.util.Scanner;

public class P1046_GameTime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startTime = sc.nextInt();
        int endTime = sc.nextInt();
        int duration;

        if (startTime >= endTime) {
            duration = (24 - startTime) + endTime;
        } else {
            duration = endTime - startTime;
        }

        System.out.println("O JOGO DUROU " + duration + " HORA(S)");
        
        sc.close();
    }
}
