package beginner;

import java.util.Scanner;

public class P1047_GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startHour, startMinute, endHour, endMinute;
        int startTotalMinutes, endTotalMinutes, totalDuration;
        int durationHours, durationMinutes;

        startHour = sc.nextInt();
        startMinute = sc.nextInt();

        endHour = sc.nextInt();
        endMinute = sc.nextInt();

        startTotalMinutes = (startHour * 60) + startMinute;
        endTotalMinutes = (endHour * 60) + endMinute;

        totalDuration = endTotalMinutes - startTotalMinutes;

        if (totalDuration <= 0) {
            totalDuration = totalDuration + (24 * 60);
        }

        durationHours = totalDuration / 60;
        durationMinutes = totalDuration % 60;

        System.out.println("O JOGO DUROU " + durationHours + " HORA(S) E " + durationMinutes + " MINUTO(S)");

        sc.close();
    }
}