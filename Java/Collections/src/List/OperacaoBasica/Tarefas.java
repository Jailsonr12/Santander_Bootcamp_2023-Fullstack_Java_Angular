package List.OperacaoBasica;

public class Tarefas {
	// Atributo

	private String descricao;

	public Tarefas(String descricao) {

		this.descricao = descricao;

	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	
	}

	@Override
	public String toString() {
		return  descricao;
	}
	
	
}
