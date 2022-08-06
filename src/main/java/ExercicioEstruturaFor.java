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
 */
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
