package classes;

import java.util.Scanner;

public class Aula27 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // COMO LER ATÉ A QUEBRA DE LINHA
        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // QUEBRA DE LINHA PRA CONSUMIR A QUEBRA DE LINHA PENDENTE
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }
}
