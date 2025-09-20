package godClass;

public class PagamentoService {
    public void processarPagamento(String metodo, double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via " + metodo);
    }
}