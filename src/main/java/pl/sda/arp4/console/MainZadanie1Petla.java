package pl.sda.arp4.console;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class MainZadanie1Petla {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println((i + 1));
        }
        for (int j = 1000; j < 1020; j++) {
            System.out.print((j + 1) + ",");
        }
        for (int i = -30; i < 1001; i++) {
            if (i % 5 == 0)
                System.out.println(i);
        }
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }
        for (int i = 30; i < 301; i++) {
            boolean podzielnePrzez3 = i % 3 == 0;
            boolean podzielnePrzez5 = i % 5 == 0;
            if (podzielnePrzez5 && podzielnePrzez5) {
                System.out.println(i);
            }
            }
        }
    }
