package subsistema2.cep;

public class CepApi {

    private static  CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public static void setInstancia(CepApi instancia) {
        CepApi.instancia = instancia;
    }

    public String recuperarCidade(String cep){
        return "Blumenau";

    }
    public String recuperarEstado(String cep){
        return "SC";

    }
}
