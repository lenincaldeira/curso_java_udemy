package util;

public class Calculator {

    public final double PI = 3.14159; // Uma vez atribuido a palavra "final" ao "public static" a constante declarada nao pode ser alterada de forma nenhuma.
    // padrao para nomes de constantes no JAVA serao em letras maiusculas. EX.: "public static final double NET_SALARY = 100.0"

    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
