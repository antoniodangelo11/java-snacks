package org.lessons.java.snacks;

/*Snack1
Continua a chiedere all’utente di inserire un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
Se il numero è negativo termina.
*/

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {

        // Inizializzo lo Scanner
        Scanner input = new Scanner(System.in);

        // Ciclo sul numero per stabilire se è pari o dispari
        while (true) {
            System.out.print("Inserisci un numero (negativo per uscire): ");
            int number = input.nextInt();

            if (number < 0) {
                System.out.println("Hai inserito un numero negativo. Il programma termina.");
                break;
            } else if (number % 2 == 0) {
                System.out.println("Il numero inserito è pari: " + number);
            } else {
                int successivo = number + 1;
                System.out.println("Il numero inserito è dispari. Numero successivo: " + successivo);
            }
        }

        // Chiudo lo Scanner
        input.close();
    }
}
