package org.cakelook.sudalichaa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Napiš číslo, které nevíš jestli je sudé nebo liché");
        int suda = scanner.nextInt();

        if (suda % 2 == 0) {
            System.out.println("Je to sude!");
        }
        else {
            System.out.println("Je to liche!");
        }
    }
}

// sout = System.out
