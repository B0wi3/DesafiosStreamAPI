package Desafios;

import java.util.*;

public class MediaMaioresQueCinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble result = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average();

        System.out.println(result);
    }
}
