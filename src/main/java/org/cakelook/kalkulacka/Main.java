package org.cakelook.kalkulacka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadejte první číslo: ");
        double cislo1 = scanner.nextDouble();

        System.out.print("Zadejte druhé číslo: ");
        double cislo2 = scanner.nextDouble();

        System.out.println("Součet: " + (cislo1 + cislo2));
        System.out.println("Rozdíl: " + (cislo1 - cislo2));
        System.out.println("Násobek: " + (cislo1 * cislo2));
        System.out.println("Podíl: " + (cislo2 != 0 ? (cislo1 / cislo2) : "Není možné dělit nulou"));
    }
}