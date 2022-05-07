package pl.sda.arp4.console;

import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoj stan cywilny: wolny/zajety");
        String stanCywilny = scanner.next();

        // dekladacja przed if-em
        StanCywilny zmiennaStanCywilny = StanCywilny.NIEZNANY;

        if (stanCywilny.equalsIgnoreCase("ZAJĘTY")) {
            zmiennaStanCywilny = StanCywilny.ZAJĘTY;
        } else if (stanCywilny.equalsIgnoreCase("WOLNY")){
            zmiennaStanCywilny = StanCywilny.WOLNY;
        }
        System.out.println(zmiennaStanCywilny);


        switch (zmiennaStanCywilny) {
            case WOLNY:
                System.out.println("To jest wolny ziomek");
                break;
            case ZAJĘTY:
                System.out.println("Ten typ jest zajety");
                break;
            default:// else NIEZNANY
                System.out.println("Ani jest wolny, ani zajety, nie wiemy!");
        }
    }
}