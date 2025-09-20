package primitveObsession;

public class Cep {
    private final String valor;

    public Cep(String valor) {
        if (valor == null || !valor.matches("\\d{5}-\\d{3}")) {
            throw new IllegalArgumentException("CEP inválido: " + valor);
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor;
    }
}
