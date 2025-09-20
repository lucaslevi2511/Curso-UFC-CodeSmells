package godClass;

public class Sistema {

    // A classe faz de tudo!
    public void cadastrarUsuario(String nome, String email) {
        System.out.println("Usuário cadastrado: " + nome + " - " + email);
    }

    public void removerUsuario(String email) {
        System.out.println("Usuário removido: " + email);
    }

    public void enviarEmail(String destino, String mensagem) {
        System.out.println("Enviando email para " + destino + ": " + mensagem);
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado!");
    }

    public void gerarRelatorioDeVendas() {
        System.out.println("Relatório de vendas gerado!");
    }

    public void processarPagamento(String metodo, double valor) {
        System.out.println("Pagamento de R$" + valor + " processado via " + metodo);
    }
}
