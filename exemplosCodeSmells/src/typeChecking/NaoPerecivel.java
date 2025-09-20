package typeChecking;

public class NaoPerecivel extends Produto {
	public String getTipo() { return "Não Perecível"; }
    public void empilhar() { System.out.println("Produto empilhado."); }
}
