package org.lessons.java.snacks;

/*Snack5
Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
Possibile usare solo:
cicli
chartAt
if / switch
Es. “25" come stringa deve essere convertito in intero 25.
*/
public class Snack5 {
    public static void main(String[] args) {

        // Stringa che può variare
        String numberString = "20";

        int length = numberString.length();
        int result = 0;

        for (int i = 0; i < length; i++) {
            char charDigit = numberString.charAt(i);

            if (charDigit >= '0' && charDigit <= '9') {
                int intFigure = charDigit - '0';
                result = result * 10 + intFigure;
            } else {
                System.out.println("La stringa non è un numero.");
                return;
            }
        }

        System.out.println("Il numero convertito è: " + result);
    }
}
