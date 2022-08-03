import java.util.Locale;
import java.util.Scanner;

public class Aula37exercicioEstruturaCondicional {

    public static void main(String[] args) {
/*
Exercicio 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
import java.util.Scanner;

public class Aula37exercicioEstruturaCondicional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x >= 0) {
            System.out.println("NAO NEGATIVO!");
        }
        else {
            System.out.println("NEGATIVO");
        }

        sc.close();

Exercicio 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
import java.util.Scanner;

public class Aula37exercicioEstruturaCondicional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("PAR!");
        }
        else {
            System.out.println("IMPAR");
        }

        sc.close();

Exercicio 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
import java.util.Scanner;

public class Aula37exercicioEstruturaCondicional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos!");
        }
        else {
            System.out.println("Nao sao Multiplos!");
        }

        sc.close();

Exercicio 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
import java.util.Scanner;

public class Aula37exercicioEstruturaCondicional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();

Exercicio 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
import java.util.Locale;
import java.util.Scanner;

public class Aula37exercicioEstruturaCondicional {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total = 0;

        if (codigo == 1) {
                total = quantidade * 4;
        }
        else if (codigo == 2) {
                total = quantidade * 4.5;
        }
        else if (codigo == 3) {
                total = quantidade * 5;
        }
        else if (codigo == 4) {
                total = quantidade * 2;
        }
        else if (codigo == 5) {
                total = quantidade * 1.5;
        }
        else {
                System.out.println("Digite o codigo correto do produto!");
        }

        System.out.printf("Total: R$%.2f%n", total);

        sc.close();

Exercicio 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
import java.util.Locale;
import java.util.Scanner;

public class Aula37exercicioEstruturaCondicional {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        if (N < 0 || N > 100) {
            System.out.println("Fora de intervalo");
        } else if (N <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (N <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (N <= 75) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();

Exercicio 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
import java.util.Scanner;

public class Aula37exercicioEstruturaCondicional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        sc.close();

Exercicio 7 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
import java.util.Locale;
import java.util.Scanner;

public class Aula37exercicioEstruturaCondicional {

    public static void main(String[] args) {

 */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}

