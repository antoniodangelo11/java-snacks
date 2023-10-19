package org.lessons.java.snacks;

/*Snack2
Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
*/

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {

        // Array di nomi
        String[] names = {
                "Jay",
                "Daisy",
                "Tom",
                "Jordan",
                "Myrtle",
                "Nick",
                "George",
                "Meyer",
                "Lucille",
                "Ewing",
                "Catherine"
        };

        // Array di cognomi
        String[] surnames = {
                "Gatsby",
                "Buchanan",
                "Wilson",
                "Carraway",
                "Tomlinson",
                "Wolfsheim",
                "Mccarthy",
                "Purdy",
                "Harding",
                "Mee",
                "Sloan"
        };

        // Inizializzo Random
        Random rand = new Random();

        // Questo dato può variare (10)
        int numberOfGuests = 10;

        System.out.println("Lista falsa di invitati: ");

        for (int i = 0; i < numberOfGuests; i++) {
            String randomName = names[rand.nextInt(names.length)];
            String randomSurname = surnames[rand.nextInt(surnames.length)];

            System.out.println((i + 1) + ". " + randomName + " " + randomSurname);
        }
    }
}
