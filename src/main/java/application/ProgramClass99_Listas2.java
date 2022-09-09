package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramClass99_Listas2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());

        //Tipos de list.remove
        //list.remove("Anna");
        //list.remove(1);

        for (String x: list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x: list) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        // 1o converte pra "list.stream()"
        // 2o faz a  operacao ".filter(x -> x.charAt(0) == 'A')"
        // 3o depois usa  camando de retorno pra lista ".collect(Collectors.toList())" - VERSOES DO JAVA 8 EM DIANTE
        for (String x: result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        //O findFirst() pega o primeiro elemento da stream que atende o predicado: "filter(x -> x.charAt(0) == 'A')"
        // Caso o elemento nao exista ele retorna o valor nulo.
        for (String x: result) {
            System.out.println(x);
        }
    }
}
