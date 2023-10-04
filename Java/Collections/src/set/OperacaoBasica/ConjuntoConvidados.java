package set.OperacaoBasica;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {

	// atributo

	private Set<Convidado> convidadosSet;

	public ConjuntoConvidados() {
		this.convidadosSet = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadosSet.add(new Convidado(nome, codigoConvite));

	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadosParaRemover = null;
		for (Convidado c : convidadosSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadosParaRemover = c;
				break;
			}
		}
		convidadosSet.remove(convidadosParaRemover);
	}

	public void contarConvidados() {
		System.out.println(convidadosSet.size());
	}

	public void exibirConvidados() {
		System.out.println(convidadosSet);
	}

}
