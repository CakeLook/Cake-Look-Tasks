package org.cakelook.calulator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = scanner.nextInt();

        System.out.println("Enter second number");
        num2 = scanner.nextInt();

        System.out.println("the sum of the number is: " + (num1 + num2));
    }
}
