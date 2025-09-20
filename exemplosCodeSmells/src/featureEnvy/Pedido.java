package featureEnvy;

public class Pedido {
	private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    // Esse método "inveja" os dados do Cliente
    public void imprimirEtiqueta() {
        System.out.println("Destinatário: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Cidade: " + cliente.getCidade());
        System.out.println("CEP: " + cliente.getCep());
    }
}
