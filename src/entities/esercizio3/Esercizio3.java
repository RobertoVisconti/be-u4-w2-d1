package entities.esercizio3;

import entities.exception.BancaException;

import java.util.Scanner;

public class Esercizio3 {
    static void main(String[] args) throws BancaException {
        Scanner scanner = new Scanner(System.in);

        ContoCorrente conto = new ContoCorrente("Giacomo", 25000.00);
        ContoOnLine contoOnline = new ContoOnLine("Roberto", 55000.00, 750);


        System.out.println(conto.getSaldo());
        while (true) {
            try {
                System.out.println("Quanto vuoi prelevare:");
                double preleva = Double.parseDouble(scanner.nextLine());
                conto.preleva(preleva);
                System.out.println(conto.getSaldo());

            } catch (BancaException e) {
                System.out.println("Errore:" + e.getMessage());
            }
            break;
        }

        System.out.println("ContoOnline saldo :" + contoOnline.getSaldo());
        while (true) {
            try {
                System.out.println("Quanto vuoi prelevare:");
                double preleva = Double.parseDouble(scanner.nextLine());
                contoOnline.preleva(preleva);
                System.out.println(contoOnline.getSaldo());
                break;
            } catch (BancaException e) {
                System.out.println("Errore:" + " " + e.getMessage());

            }
        }
    }
}
