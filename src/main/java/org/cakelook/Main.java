package org.cakelook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadej číslo a zjisti jestli je sudé nebo liché: ");
        int cislo = scanner.nextInt();
        if (cislo % 2 == 0) {
            System.out.println(cislo + " je sudé číslo.");
        } else {
            System.out.println(cislo + " je liché číslo.");
        }
    }
}