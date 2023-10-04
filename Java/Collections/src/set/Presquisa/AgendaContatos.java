package set.Presquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {

	// atributo

	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}

	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}

	public void exibirContatos() {
		System.out.println(contatoSet);
	}

	public Set<Contato> pesquisarPorNome(String nome) {
		Set<Contato> pesquisarPorNome = null;
		for (Contato c : contatoSet) {
			if (c.getNome().startsWith(nome)) {
				pesquisarPorNome.add(c);
				break;
			}

		}
		return pesquisarPorNome;

	}

	public Contato atualizarNumeroContato(String nome, int novoNumero) {

		Contato contatoAtualizado = null;
		for (Contato c : contatoSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}

}
