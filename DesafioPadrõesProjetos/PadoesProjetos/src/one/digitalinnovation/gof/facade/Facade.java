package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

    public void migraCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade("123");
        String estado = CepApi.getInstancia().recuperarEstado("123");
        CrmService.gravarCliente(nome,cep,estado,cidade);

    }
}
