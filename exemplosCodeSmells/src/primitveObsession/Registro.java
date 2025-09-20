package primitveObsession;

public class Registro {
    private String cepEntrega;   // String crua para representar CEP
    private String telefone;     // String crua para representar telefone

    public Registro(String cepEntrega, String telefone) {
        this.cepEntrega = cepEntrega;
        this.telefone = telefone;
    }

    public String getCepEntrega() { return cepEntrega; }
    public void setCepEntrega(String cepEntrega) { this.cepEntrega = cepEntrega; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
}

