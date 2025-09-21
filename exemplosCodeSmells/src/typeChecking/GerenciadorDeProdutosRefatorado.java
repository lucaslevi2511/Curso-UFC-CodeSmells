package typeChecking;

public class GerenciadorDeProdutosRefatorado {
    public void organizarProduto(ProdutoRefatorado produto) {
        // Agora não precisa mais de instanceof
        produto.organizar();
    }
}
