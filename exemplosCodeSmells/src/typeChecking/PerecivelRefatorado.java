package typeChecking;

public class PerecivelRefatorado extends ProdutoRefatorado {
    @Override
    public String getTipo() { return "Perecível"; }

    @Override
    public void organizar() {
        resfriar();
    }

    private void resfriar() {
        System.out.println("Produto resfriado.");
    }
}
