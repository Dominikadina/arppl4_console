package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie4ForWhileDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe pierwsza: ");
        int poczatekZakresu = scanner.nextInt();
        System.out.println("Podaj liczbe druga: ");
        int koniecZakresu = scanner.nextInt();

        if (poczatekZakresu > koniecZakresu) {
            System.out.println("Bledne dane");
        }
        System.out.println("Podaj dzielnik");
        int dzielnik = scanner.nextInt();

        int i = poczatekZakresu;
        while (i < koniecZakresu + 1) {

            if (i % dzielnik == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}