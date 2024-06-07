package Desafios;

import java.util.*;

public class VerificaDistintos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        long result = numeros.stream().distinct().count();

        System.out.println(result + " distintos.");

        if (result < numeros.size()) {
            System.out.println("Nem todos são distintos.");
        } else {
            System.out.println("Todos são distintos.");
        }
    }
}
