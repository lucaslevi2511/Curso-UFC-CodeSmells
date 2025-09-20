package typeChecking;

public class GerenciadorDeProdutos {
	 public void organizarProduto(Produto produto) {
	        if (produto instanceof Perecivel) {
	            ((Perecivel) produto).resfriar();
	        } else if (produto instanceof NaoPerecivel) {
	            ((NaoPerecivel) produto).empilhar();
	        }
	    }
}
