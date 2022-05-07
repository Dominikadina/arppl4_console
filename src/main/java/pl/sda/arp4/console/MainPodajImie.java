package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPodajImie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        String Imie = scanner.next();
// tekst porownujemy equals a nie ==

        if (Imie.equals("Marian")) {
            System.out.println("Siema Kolego Dawno sie nie widzielsicmy");
        } else {
            System.out.println("Witaj " + Imie + "!");

        }
    }
}