package pl.sda.arp4.console;

import java.util.Scanner;

public class MainIloscPowtorzen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilosc powtorzen dla Hello World:");
     int liczba = scanner.nextInt();


        for (int i = 0; i < liczba; i++) {
            System.out.println((i + 1) + " Hello World!");
        }
                }
    }