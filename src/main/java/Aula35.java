import java.util.Scanner;

public class Aula35 {
    public static void main(String[] args){
/*
exemplo 1

        int x = 5;

        System.out.println("Bom dia!");

        if (x < 0) {
            System.out.println("Bom tarde!");
        }

        System.out.println("Bom noite!");

Exemplo 2


        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else {
            System.out.println("Boa tarde!");
        }

        sc.close();

Exemplo 3
 */
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        }
        else if (hora < 18) {
            System.out.println("Boa tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}
