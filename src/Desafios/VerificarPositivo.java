package Desafios;

import java.util.*;

public class VerificarPositivo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean allPositive = numeros.stream().allMatch(n -> n > 0);

        if (allPositive) {
            System.out.println("Todos são positivos");
        } else {
            System.out.println("Há números negativos");
        }
    }
}
