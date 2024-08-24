package org.cakelook.kalkulacka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number you want: ");
        double knedlik = scanner.nextDouble();
        System.out.println("Second number monkey: ");
        double kvin = scanner.nextDouble();

        System.out.println("Soucet: " + (knedlik + kvin));
        System.out.println("Rozdil: " + (knedlik - kvin));
        System.out.println("Soucin: " + (knedlik * kvin));


        if (kvin == 0) {
            System.out.println("Nejde nulou monkey");
        }
        else {
            System.out.println("Podil " + (knedlik / kvin));
        }
    }
}


// 👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹