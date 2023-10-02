package List.OperacaoBasica;

import java.util.ArrayList;
import java.util.List;

public class CarinhoDeCompras {

	private List<Item> itemList;

	public CarinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int qnt) {
		this.itemList.add(new Item(nome, preco, qnt));
	}

	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<>();
		for (Item t : itemList) {
			if (t.getNome().equalsIgnoreCase(nome)) {
				itemParaRemover.add(t);
			}
		}
		itemList.removeAll(itemParaRemover);
	}

	public double calcularValorTotal() {
		double valorTotal = 0d;
		if (!itemList.isEmpty()) {
			for (Item item : itemList) {
				double valorItem = item.getPreco() * item.getQnt();
				valorTotal += valorItem; // valorTotal = valorTotal + valorItem;
			}
			return valorTotal;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	public void exibirItens() {
		if (!itemList.isEmpty()) {
			System.out.println(this.itemList);
		} else {
			System.out.println("A lista está vazia!");
		}
	}

}
