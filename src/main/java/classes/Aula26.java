package classes;

import java.util.Scanner;

public class Aula26 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        /*
        Exemplo com String:

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        Exemplo com int:

        int x;
        x = sc.nextInt();
        System.out.println("Você digitou: " + x);

        Exemplo com double:

        double x;
        x = sc.nextDouble();
        System.out.println("Você digitou: ", x);

        Exemplo com char:

        char x;
        x = sc.next().charAt(0);
        System.out.println("Você digitou: " + x);

        Exemplo pra ler vários dados na mesma linha
         */
        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
