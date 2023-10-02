package Pesquisa.copy;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublication;

	public Livro(String titulo, String autor, int anoPublication) {
		this.anoPublication = anoPublication;
		this.autor = autor;
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublication() {
		return anoPublication;
	}

	public void setAnoPublication(int anoPublication) {
		this.anoPublication = anoPublication;
	}

	@Override
	public String toString() {
		return "SomaNumeros [titulo=" + titulo + ", autor=" + autor + ", anoPublication=" + anoPublication + "]";
	}

}
