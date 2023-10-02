package List.OperacaoBasica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefas {

	// atributo

	private List<Tarefas> tarefaList;

	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		this.tarefaList.add(new Tarefas(descricao));
	}

	public void removerTarefa(String descricao) {
		List<Tarefas> tarefasParaRemover = new ArrayList<>();
		for (Tarefas t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}

	public int obterNumeroTotalTarefas() {
		return this.tarefaList.size();
	}

	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
}
