package application;

public class ProgramClass97 {

    public static void main(String[] args) {

        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("-----------------");
        for (String obj : vect) { // mesmo efeito do metodo or (int i = 0; i < vect.length; i++)
            System.out.println(obj);
        }
    }
}
