package Map.Odernacao;

public class Evento {

	// Atributo
	private String nome;

	private String atracao;

	public Evento(String atracao, String nome) {

		this.atracao = atracao;
		this.nome = nome;

	}

	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", atracao=" + atracao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAtracao() {
		return atracao;
	}

	public void setAtracao(String atracao) {
		this.atracao = atracao;
	}
	
}