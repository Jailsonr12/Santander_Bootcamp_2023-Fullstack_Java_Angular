package Carro;

public class Carro extends Veiculo{
	
	public void ligar() {
		conferirCombustivel();
		conferirCambio();
		System.out.println("Carro ligado");
	}

	private void conferirCombustivel() {
		System.out.println("Conferir combustivel");
	}

	private void conferirCambio() {
		System.out.println("Conferir cambio P");

	}

}
