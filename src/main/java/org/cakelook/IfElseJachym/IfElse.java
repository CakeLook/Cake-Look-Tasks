package org.cakelook.IfElseJachym;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        var userInput = scanner.nextInt();
        if (userInput % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}
