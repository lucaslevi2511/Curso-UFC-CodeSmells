package primitveObsession;

public class RegistroRefatorado {
    private Cep cepEntrega;
    private Telefone telefone;

    public RegistroRefatorado(Cep cepEntrega, Telefone telefone) {
        this.cepEntrega = cepEntrega;
        this.telefone = telefone;
    }

    public Cep getCepEntrega() { return cepEntrega; }
    public void setCepEntrega(Cep cepEntrega) { this.cepEntrega = cepEntrega; }

    public Telefone getTelefone() { return telefone; }
    public void setTelefone(Telefone telefone) { this.telefone = telefone; }
}