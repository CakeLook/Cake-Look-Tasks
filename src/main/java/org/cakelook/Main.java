package org.cakelook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1");
        Integer num1 = scanner.nextInt();

        System.out.println("enter a symbol - + / *");
        String divider = scanner.next();

        System.out.println("enter num2");
        Integer num2 = scanner.nextInt();


        float output = 0;
        switch (divider) {
            case "+":
                output = num1 + num2;
                break;
            case "-":
                output = num1 - num2;
                break;
            case "/":
                if (num2 != 0){
                    output = (float) num1 / num2;
                }else{
                    System.out.println("no deviding bye 0 or elz !!!! D:<");
                }
                break;
            case "*":
                output = num1*num2;
                break;

            default:
                System.out.println("please use one of the symbols above");
                break;
        }
        System.out.println(output);
        scanner.close();
    }
}
