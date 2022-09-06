package application;

import java.util.Scanner;

public class ProgramClass91_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, maioridade, posicaomaior;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        maioridade = idades[0];
        posicaomaior = 0;

        for (int i = 0; i < n; i++) {
            if (idades[i] > maioridade) {
                maioridade = idades[i];
                posicaomaior = i;
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaomaior]);

        sc.close();
    }
}
