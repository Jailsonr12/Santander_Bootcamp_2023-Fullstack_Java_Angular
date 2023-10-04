package Desafio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Desafio 7 - Encontrar o segundo número maior da lista:
//Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

public class Desafio7 {

	 public static void main(String[] args) {
	        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

	        List<Integer> ordenado = numeros.stream()
	                .sorted()
	                .collect(Collectors.toList());

	        Collections.reverse(ordenado);

	        System.out.println(ordenado.get(1));
	    }
}
