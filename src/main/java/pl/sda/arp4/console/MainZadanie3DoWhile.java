package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie3DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst;
        do {
            System.out.println("Wpisz tekst:");
            tekst = scanner.next();

            System.out.println(tekst.toUpperCase());

        } while(!tekst.equals("quit"));
 //maly tekst na duze znaki zamienia




    }
}
