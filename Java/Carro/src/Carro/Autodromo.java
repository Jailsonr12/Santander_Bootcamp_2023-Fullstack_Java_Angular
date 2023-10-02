package Carro;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		
		jeep.setChassi("342131");
		
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("AAAAAA");
		
		z400.ligar();
	}

}
