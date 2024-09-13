package org.cakelook.faktorial;

public class Main {
    public static void main(String[] args) {
        System.out.println(fakotrial(6));
    }

    public static int fakotrial(int n) {
        if (n != 1) {
            return n * fakotrial(n - 1);
        } else {
            return 1;
        }
    }
}
