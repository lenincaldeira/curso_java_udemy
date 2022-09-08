package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramClass91_10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qtdhomens, qtdmulheres;
        double maioraltura, menoraltura, alturafemMedia, alturafemtotal;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            System.out.printf("genero da %da pessoa: ", i + 1);
            generos[i] = sc.next().charAt(0);
        }

        maioraltura = 0.0;
        menoraltura = 0.0;

        for (int i = 0; i < n; i++) {
            if (alturas[i] > maioraltura) {
                maioraltura = alturas[i];
            }
            if (alturas[i] < menoraltura) {
                menoraltura = alturas[i];
            }
        }

        qtdhomens = 0;
        qtdmulheres = 0;

        for (int i = 0; i < n; i++) {
            if (generos[i] == 'M') {
                qtdhomens++;
            }
            else {
                qtdmulheres++;
                alturafemtotal = alturafemtotal + alturas[i];
            }
        }

        alturafemMedia = alturafemtotal / qtdmulheres;

        System.out.printf("Menor altura = %.2f\n", menoraltura);
        System.out.printf("Maior altura = %.2f\n", maioraltura);
        System.out.printf("Média das altura das mulheres = %.2f\n", alturafemMedia);
        System.out.printf("Número de homens = %d\n", qtdhomens);
        System.out.printf("Número de mulheres = %d\n", qtdmulheres);

    sc.close();
    }
}
