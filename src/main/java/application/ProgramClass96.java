package application;

public class ProgramClass96 {

    public static void main(String[] args) {
        /*
        int x = 20;

        Object obj = x;

        System.out.println(obj);

        int y = (int) obj;

        System.out.println(y);

         */
        int x = 20;

        Integer obj = x; // uso da wrapper class Integer

        System.out.println(obj);

        int y = obj * 2; // Nao necessario o uso do casting pq wrapper class é tipo Integer(equivalente ao "int")

        System.out.println(y);

    }
}
