/*
EXERCICIO 1>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

import java.util.Scanner;

public class ExercicioEstruturaFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i=1; i<=x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}

EXERCICIO 2>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

import java.util.Scanner;

public class ExercicioEstruturaFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <=20) {
                in = in + 1;
            }
            else {
                out = out = 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}

EXERCICIO 3>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaFor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2 + b * 3 + c * 5)/10;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}

EXERCICIO 4>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEstruturaFor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int  i=0; i<n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0){
                System.out.println("Divisao Impossivel!");
            }
            else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }

        sc.close();
    }
}

EXERCICIO 5>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

import java.util.Scanner;

public class ExercicioEstruturaFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fat = 1;
        for (int i=1; i<=n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();
    }
}

EXERCICIO 6>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
EXERCICIO 7>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

import java.util.Scanner;

public class ExercicioEstruturaFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<n; i++) {
            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        sc.close();
    }
}

 */

import java.util.Scanner;

//nao esqueca de mudar o nome da classe para Main
public class  ExercicioEstruturaFor {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();

                for (int i=1; i<=n; i++) {
                        if (n % i == 0) {
                                System.out.println(i);
                        }
                }

                sc.close();
        }
}




