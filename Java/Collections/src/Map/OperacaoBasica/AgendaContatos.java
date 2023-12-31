package Map.OperacaoBasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	// atributo

	private Map<String, Integer> contatosMap;

	public AgendaContatos() {
		this.contatosMap = new HashMap();
	}

	public void adicionarContato(String nome, Integer telefone) {
		contatosMap.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!contatosMap.isEmpty()) {
			contatosMap.remove(nome);
		}
	}

	public void exibirContato() {
		System.out.println(contatosMap);
	}

	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!contatosMap.isEmpty()) {
			numeroPorNome = contatosMap.get(nome);
		}
		return numeroPorNome;
	}

}
