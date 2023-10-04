package Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Desafio 14 - Encontre o maior número primo da lista:
//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
public class Desafio14 {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Desafio14::isPrimo)
                .max(Integer::compareTo);

        if (maiorPrimo.isPresent()) {
            System.out.println("Maior número primo na lista: " + maiorPrimo.get());
        } else {
            System.out.println("Nenhum número primo encontrado na lista.");
        }

	}
	
	 public static boolean isPrimo(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}