package org.cakelook.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var listLimit = 10;
        var nums = new int[listLimit];
        var scanner = new Scanner(System.in);
        var sum = 0.;

        for (int i = 0; i < listLimit; i++) {
            System.out.println("input number " + (i + 1) + ":");
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < listLimit; i++) {
            sum += nums[i];
        }
        System.out.println(sum / listLimit);
    }
}
