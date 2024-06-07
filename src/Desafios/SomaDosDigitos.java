package Desafios;

import java.util.*;

public class SomaDosDigitos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaTotal = numeros.stream()
                .map(String::valueOf)
                .flatMapToInt(String::chars)
                .map(Character::getNumericValue)
                .sum();

        System.out.println(somaTotal);
    }
}
