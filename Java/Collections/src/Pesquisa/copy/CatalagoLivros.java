package Pesquisa.copy;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

	private List<Livro> livrosList;

	public CatalagoLivros() {
		this.livrosList = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublication) {
		this.livrosList.add(new Livro(titulo, autor, anoPublication));
	}

	public List<Livro> pesquiosarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();

		if (!livrosList.isEmpty()) {

			for (Livro l : livrosList) {
				if (l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}

		}
		return livrosPorAutor;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if (!livrosList.isEmpty()) {

			for (Livro l : livrosList) {
				if (l.getAnoPublication() >= anoInicial && l.getAnoPublication() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}

		}
		return livrosPorIntervaloAnos;

	}

	public Livro pesquisarPorTitulo(String titulo) {
		Livro livrosPorTitulo = null;
		if (!livrosList.isEmpty()) {

			for (Livro l : livrosList) {
				if (l.getTitulo().equalsIgnoreCase(titulo)) {
					livrosPorTitulo = l;
					break;
				}
			}

		}
		return livrosPorTitulo;

	}

}
