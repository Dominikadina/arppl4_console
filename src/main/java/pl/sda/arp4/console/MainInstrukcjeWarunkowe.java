package pl.sda.arp4.console;

import java.util.Scanner;

public class MainInstrukcjeWarunkowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe pierwsza");
        int liczbaPierwsza = scanner.nextInt();

        System.out.println("Podaj liczbe druga");
        int liczbaDruga = scanner.nextInt();

        if (liczbaPierwsza > liczbaDruga) {
            System.out.println("Liczba pierwsza jest wieksza od drugiej");
        } else if (liczbaPierwsza > liczbaDruga) {
            System.out.println("Liczba druga jest wieksza od pierwszej");
        } else if (liczbaPierwsza == liczbaDruga) {
            System.out.println("Liczby są sobie równe");
        }
    }
}
