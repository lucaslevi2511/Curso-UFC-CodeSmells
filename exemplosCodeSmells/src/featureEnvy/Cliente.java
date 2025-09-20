package featureEnvy;

public class Cliente {
	private String nome;
    private String endereco;
    private String cidade;
    private String cep;

    public Cliente(String nome, String endereco, String cidade, String cep) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getCidade() { return cidade; }
    public String getCep() { return cep; }
}
