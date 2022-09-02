package classes;

import java.util.Locale;
import java.util.Scanner;

public class Aula55 {

    public static void main(String[] args) {
        /* USANDO A ESTRUTURA "WHILE" - INADEQUADA

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite a temperatura em celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em fahrenheit %.1f%n", F);
            System.out.print("Deseja repetir (s/n)?");
            char resp = sc.next().charAt(0);

            while (resp != 'n') {
                System.out.print("Digite a temperatura em celsius: ");
                C = sc.nextDouble();
                F = 9.0 * C / 5.0 + 32.0;
                System.out.printf("Equivalente em fahrenheit %.1f%n", F);
                System.out.print("Deseja repetir (s/n)?");
                resp = sc.next().charAt(0);
            }

        sc.close();

         */

// MANEIRA CORRETA UTILIZANDO O "DO WHILE"

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.print("Digite a temperatura em celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em fahrenheit %.1f%n", F);
            System.out.print("Deseja repetir (s/n)?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
