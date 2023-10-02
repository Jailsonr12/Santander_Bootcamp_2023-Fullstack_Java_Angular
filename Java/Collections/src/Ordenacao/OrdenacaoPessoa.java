package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

	// atributo

	private List<Pessoa> pessoalist;

	public OrdenacaoPessoa() {
		this.pessoalist = new ArrayList<>();
	}

	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoalist.add(new Pessoa(nome, idade, altura));
	}

	public List<Pessoa> pordenarPorIdade() {
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoalist);
		Collections.sort(pessoaPorIdade);
		return pessoaPorIdade;

	}
	
	public List<Pessoa> pordenarPorAltura() {
		List<Pessoa> pordenarPorAltura = new ArrayList<>(pessoalist);
		Collections.sort(pordenarPorAltura , new ComparetorPorAltura());
		return pordenarPorAltura;

	}

}
