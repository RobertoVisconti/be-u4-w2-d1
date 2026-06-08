package entities.esercizio2;

import java.util.Locale;
import java.util.Scanner;

public class Esercizio2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("*** Calcolo consumo carburante ***");

        while (true) {
            try {
                System.out.println("Per uscire dal programma premere 0. Inserisci i km percorsi:");
                double km = Double.parseDouble(scanner.nextLine());
                if (km < 0) {
                    throw new Exception("Numero inserito non valido");
                } else if (km == 0) {
                    break;

                } else {
                    while (true) {
                        try {
                            System.out.println("Inserisci i litri consumati:");
                            double litri = Double.parseDouble(scanner.nextLine());
                            if (litri <= 0) {
                                throw new RuntimeException("Divisione per 0 non possibile");
                            } else {
                                System.out.println("Eseguo il calcolo:");
                                double kmLitri = km / litri;
                                System.out.println("hai consumato:" + " " + kmLitri + "km/l");
                                break;
                            }
                        } catch (RuntimeException e) {
                            System.out.println("Errore:" + " " + e.getMessage());
                        }

                    }
                }

            } catch (Exception e) {
                System.out.println("Errore:" + " " + e.getMessage());
            }
        }
    }
}
