package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPetlaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba; // deklaracja liczby przed
        do {
            System.out.println("Podaj liczbe");
            liczba = scanner.nextInt();
            //int liczba = scanner.nextInt(); - o moge usunac bo zadeklarowalam przed klamra

           System.out.println("Hello World");
        }while (liczba>0);

        }
    }
