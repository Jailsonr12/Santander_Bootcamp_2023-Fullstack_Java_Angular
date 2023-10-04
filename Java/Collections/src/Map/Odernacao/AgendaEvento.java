package Map.Odernacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {

	// Atributos

	private Map<LocalDate, Evento> eventoMap;

	public AgendaEvento() {
		eventoMap = new HashMap<>();
	}

	public void adicionarEventos(LocalDate data, String nome, String atracao) {
		eventoMap.put(data, new Evento(nome, atracao));
	}

	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
	}

	public void proximoEvento() {
//		Set<LocalDate> dataSet = eventoMap.keySet();
//		Collection<Evento> values = eventoMap.values();
		LocalDate proximoData = null;
		Evento proximoEvento = null;
		LocalDate dataAtual = LocalDate.now();
		
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
		
		for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
			if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximoData = entry.getKey();
				proximoEvento = entry.getValue();

				System.out.println("O proximo evento é " + proximoEvento + " acontecerar na data " + proximoData);
				break;
			}

		}

	}

	public static void main(String[] args) {
		AgendaEvento agendaEventos = new AgendaEvento();

	    // Adiciona eventos à agenda
	    agendaEventos.adicionarEventos(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
	    agendaEventos.adicionarEventos(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
	    agendaEventos.adicionarEventos(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
	    agendaEventos.adicionarEventos(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
	    agendaEventos.adicionarEventos(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

	    // Exibe a agenda completa de eventos
	    agendaEventos.exibirAgenda();

	    // Obtém e exibe o próximo evento na agenda
	    agendaEventos.proximoEvento();
	  }
}
