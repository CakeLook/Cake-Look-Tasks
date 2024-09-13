package org.cakelook.WorkWithText;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var word = "";
        var flippedWord = "";
        var scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        word = scanner.nextLine();

        var strBuffer = new StringBuilder(word);

        strBuffer.reverse();
        flippedWord = strBuffer.toString();
        System.out.println(flippedWord);

        if(word.equals(flippedWord)){
            System.out.println("the word is a palindrome");
        }
        else{
            System.out.println("the word is not a palindrome");
        }

    }
}
