package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramClass91_3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        for (int i=0; i < n; i++) {
            System.out.print("Digite um  numero: ");
            vetor[i] = sc.nextDouble();
        }

        double maior = 0.0;
        int posmaior = 0;

        for (int i=0; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posmaior = i;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

        sc.close();
    }
}
