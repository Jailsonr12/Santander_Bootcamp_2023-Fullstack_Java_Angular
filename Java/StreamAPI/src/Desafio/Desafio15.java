package Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

//Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
//Utilizando a Stream API, verifique se a lista contém pelo menos um número 
//negativo e exiba o resultado no console.
public class Desafio15 {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

		
		List<Integer> numeroNegativo = numeros.stream().filter(n -> n < 0).toList();
		
		//Chat GPT 
		
		// boolean contemNegativo = numeros.stream().anyMatch(n -> n < 0);
		
		if (numeroNegativo.isEmpty()) {
			System.out.println("Nao há numero negativo");
		}else {
			System.out.println("Numero negativo é: " + numeroNegativo);
		}
	}
}