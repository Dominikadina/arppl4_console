package pl.sda.arp4.console;

import java.util.Scanner;

public class MainDekady {
    public static void main(String[] args) {
        System.out.println("Podaj swoj wiek:");

        Scanner scanner = new Scanner(System.in);

        int zmiennawiek = scanner.nextInt();
        int wiekdekady = zmiennawiek/10;

        System.out.println("Żyjesz " + wiekdekady + "dekady");

    }
}
