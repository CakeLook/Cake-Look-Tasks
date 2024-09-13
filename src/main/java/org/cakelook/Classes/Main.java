package org.cakelook.Classes;

public class Main {
    public static void main(String[] args) {
        var Miata = new Auto("mazda", "miata", 1989);

        var Porsche = new Auto("Porsche", "911", 1964);

        var Ford = new Auto("Ford", "Focus", 1998);

        System.out.println(Miata.getZnacka());
    }
}
