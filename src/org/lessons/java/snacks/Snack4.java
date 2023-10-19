package org.lessons.java.snacks;

import java.util.Scanner;

/*Snack4
Data in input una stringa verificare se è palindroma
*/
public class Snack4 {
    public static void main(String[] args) {

        // Stringa che può variare
        String input = "radar";

        input = input.replaceAll("\\s", "").toLowerCase();

        boolean isPalindroma = true;

        int n = input.length();
        for (int i = 0; i < n / 2; i++) {
            if (input.charAt(i) != input.charAt(n - 1 - i)) {
                isPalindroma = false;
                break;
            }
        }

        if (isPalindroma) {
            System.out.println("La stringa è palindroma.");
        } else {
            System.out.println("La stringa non è palindroma.");
        }
    }
}
