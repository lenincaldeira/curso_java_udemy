/*
EXEMPLO 1

import java.util.Scanner;

public class Aula50 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;
        for (int i=0; i<N; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);

        sc.close();
    }
}
EXEMPLO 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

public class Aula50 {

    public static void main(String[] args) {

        for (int i=0; i<5; i++){
            System.out.println("Valor de i: " + i);
        }
    }
}

EXEMPLO 3>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

 */
public class Aula50 {

    public static void main(String[] args) {

        for (int i=4; i>=0; i--){
            System.out.println("Valor de i: " + i);
        }
    }
}