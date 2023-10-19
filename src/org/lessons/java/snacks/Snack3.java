package org.lessons.java.snacks;

/*Snack3
Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
*/
public class Snack3 {
    public static void main(String[] args) {

        // Array di numeri interi
        int[] wholeNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};

        int oddSum = 0;

        // Verifico se l'indice è dispari e faccio la somma
        for (int i = 0; i < wholeNumbers.length; i++) {
            if (i % 2 != 0) {
                oddSum += wholeNumbers[i];
            }
        }

        System.out.println("Somma degli elementi in posizione dispari: " + oddSum);
    }
}
