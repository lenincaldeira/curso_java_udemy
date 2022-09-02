package classes;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaSequencial {
    public static void main(String[] args){
        /*
Exercicio extra:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", + area);
        System.out.printf("PRECO = %.2f%n", + preco);

        sc.close();

Exercicio 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


            Scanner sc = new Scanner(System.in);

            int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();

Exercicio 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double area, R, pi = 3.14159;;

        R = sc.nextDouble();

        area = pi * R * R;

        System.out.printf("Area = %.4f%n", area);

        sc.close();

Exercicio 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int dif;

        dif = (A * B - C * D);

        System.out.println("DIFERENCA = " + dif);

        sc.close();

Exercicio 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int numero, horas;
            double vHora, salary;

            numero = sc.nextInt();
            horas = sc.nextInt();
            vHora = sc.nextDouble();

        salary = horas * vHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = %.2f%n", salary);

        sc.close();

Exercicio 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int qte1, qte2, cod1, cod2;
            double valor1, valor2, total;

            cod1 = sc.nextInt();
            qte1 = sc.nextInt();
            valor1 = sc.nextDouble();

            cod2 = sc.nextInt();
            qte2 = sc.nextInt();
            valor2 = sc.nextDouble();

        total = qte1 * valor1 + qte2 * valor2;

        System.out.printf("Total a pagar = R$%.2f%n", total);

        sc.close();

Exercicio 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        */

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi;

            A = sc.nextDouble();
            B = sc.nextDouble();
            C = sc.nextDouble();
            pi = 3.14159;

        triangulo = (A * C)/2;
        circulo = pi * C * C;
        trapezio = ((A + B) * C)/2;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("AREA DO TRIANGULO = %.3f%n", triangulo);
        System.out.printf("AREA DO CIRCULO = %.3f%n", circulo);
        System.out.printf("AREA DO TRAPEZIO = %.3f%n", trapezio);
        System.out.printf("AREA DO QUADRADO = %.3f%n", quadrado);
        System.out.printf("AREA DO RETANGULO = %.3f%n", retangulo);

        sc.close();

    }
}
