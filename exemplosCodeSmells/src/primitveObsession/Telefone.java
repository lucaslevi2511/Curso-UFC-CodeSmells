package primitveObsession;

public class Telefone {
    private final String numero;

    public Telefone(String numero) {
        if (numero == null || !numero.matches("\\(\\d{2}\\)\\d{4,5}-\\d{4}")) {
            throw new IllegalArgumentException("Telefone inválido: " + numero);
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}
