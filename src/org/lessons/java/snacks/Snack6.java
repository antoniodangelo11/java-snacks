package org.lessons.java.snacks;

/*Snack 6
Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)
*/
public class Snack6 {
    public static void main(String[] args) {

        // Numero che può variare
        int totalSeconds = 5000;

        int ore = totalSeconds / 3600;
        int minuti = (totalSeconds % 3600) / 60;
        int secondi = totalSeconds % 60;

        String timeFormat = String.format("%02d:%02d:%02d", ore, minuti, secondi);

        System.out.println("Tempo convertito: " + timeFormat);
    }
}
