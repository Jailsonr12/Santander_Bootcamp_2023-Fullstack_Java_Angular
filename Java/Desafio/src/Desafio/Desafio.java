package Desafio;

import java.util.Iterator;
import java.util.Scanner;

public class Desafio {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int a, b, c;
	        String mensagem = "";
	        
	        a = 1;
	        b = 2;
	        c = 3;

	        // Verifica se é possível formar um triângulo
	        if (a < b + c && b < a + c && c < a + b) {
	            // Verifica o tipo de triângulo
	            if (a == b && b == c) {
	                mensagem = "Equilátero";
	            } else if (a == b || b == c || a == c) {
	                mensagem = "Isósceles";
	            } else {
	                mensagem = "Escaleno";
	            }
	        } else {
	            mensagem = "Não é possível formar um triângulo";
	        }

	        // Exibe a mensagem
	        System.out.println("Mensagem: " + mensagem);
	        
	        a = 3;
	        b = 4;
	        c = 5;

	        // Verifica se é possível formar um triângulo
	        if (a < b + c && b < a + c && c < a + b) {
	            // Verifica o tipo de triângulo
	            if (a == b && b == c) {
	                mensagem = "Equilátero";
	            } else if (a == b || b == c || a == c) {
	                mensagem = "Isósceles";
	            } else {
	                mensagem = "Escaleno";
	            }
	        } else {
	            mensagem = "Não é possível formar um triângulo";
	        }

	        // Exibe a mensagem
	        System.out.println("Mensagem: " + mensagem);
	        
	        a = 2;
	        b = 2;
	        c = 4;

	        // Verifica se é possível formar um triângulo
	        if (a < b + c && b < a + c && c < a + b) {
	            // Verifica o tipo de triângulo
	            if (a == b && b == c) {
	                mensagem = "Equilátero";
	            } else if (a == b || b == c || a == c) {
	                mensagem = "Isósceles";
	            } else {
	                mensagem = "Escaleno";
	            }
	        } else {
	            mensagem = "Não é possível formar um triângulo";
	        }

	        // Exibe a mensagem
	        System.out.println("Mensagem: " + mensagem);
	        
	        a = 4;
	        b = 4;
	        c = 4;

	        // Verifica se é possível formar um triângulo
	        if (a < b + c && b < a + c && c < a + b) {
	            // Verifica o tipo de triângulo
	            if (a == b && b == c) {
	                mensagem = "Equilátero";
	            } else if (a == b || b == c || a == c) {
	                mensagem = "Isósceles";
	            } else {
	                mensagem = "Escaleno";
	            }
	        } else {
	            mensagem = "Não é possível formar um triângulo";
	        }

	        // Exibe a mensagem
	        System.out.println("Mensagem: " + mensagem);
	        
	        a = 5;
	        b = 3;
	        c = 3;

	        // Verifica se é possível formar um triângulo
	        if (a < b + c && b < a + c && c < a + b) {
	            // Verifica o tipo de triângulo
	            if (a == b && b == c) {
	                mensagem = "Equilátero";
	            } else if (a == b || b == c || a == c) {
	                mensagem = "Isósceles";
	            } else {
	                mensagem = "Escaleno";
	            }
	        } else {
	            mensagem = "Não é possível formar um triângulo";
	        }

	        // Exibe a mensagem
	        System.out.println("Mensagem: " + mensagem);
	        
	    }
}