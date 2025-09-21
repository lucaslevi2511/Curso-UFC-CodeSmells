package typeChecking;

public class NaoPerecivelRefatorado extends ProdutoRefatorado {
    @Override
    public String getTipo() { return "Não Perecível"; }

    @Override
    public void organizar() {
        empilhar();
    }

    private void empilhar() {
        System.out.println("Produto empilhado.");
    }
}
