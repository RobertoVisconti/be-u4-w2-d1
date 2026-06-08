package entities.esercizio1;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numeri = new int[5];

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = random.nextInt(10) + 1;
        }
        System.out.println("Array iniziale:" + " " + Arrays.toString(numeri));
        while (true) {
            try {
                System.out.println("Inserisci un numero che preferring oppure 0 per uscire:");
                int numero = Integer.parseInt(scanner.nextLine());

                if (numero == 0) {
                    System.out.println("Chiusura del programma");
                    break;
                }

                System.out.println("In che posizione vuoi inserire il tuo" + " " + numero + " da 1 a 5 oppure 0 per uscire:");
                int posizione = Integer.parseInt(scanner.nextLine());

                if (posizione < 0 || posizione > numeri.length) {
                    throw new ArrayIndexOutOfBoundsException("Indice:" + " " + posizione + "posizione non valida");
                }
                numeri[posizione - 1] = numero;
                System.out.println("Nuovo stato dell'array:" + Arrays.toString(numeri));
            } catch (Exception e) {
                System.out.println("Errore:" + e.getMessage());
            }
        }
        scanner.close();
    }
}
