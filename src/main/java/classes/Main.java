package classes;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;
        String nome = "Lenin";
        int idade = 35;
        double renda = 4000.0;

        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Hello World!");
        System.out.print("Good Morning!");
        System.out.println("RESULT = " + x + "METROS!");
        System.out.printf("RESULT = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);



    }
}