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
        System.out.println("Podil " + (knedlik / kvin));

    }
}

// Scanner (v podstatě hledá user input)
// import (scanner jsem musel první importnout)
// Non-static method 'nextDouble()' cannot be referenced from a static context (potřeboval jsem tam přidat nějakou class ale ta se nemuže jmneovat stejně jako fuknce, takže jsem tam dal Scanner akorat maly S)
// next.Double (v podstatě to jsou dvě číselný hodnoty)
// 👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹👹