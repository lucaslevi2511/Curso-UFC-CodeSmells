package dataClass;

public class ClienteComMetodo {
    private String nome;
    private String email;
    private String telefone;

    public ClienteComMetodo(String nome, String email, String telefone) {
        if (!validarEmail(email)) {
            throw new IllegalArgumentException("Email inválido: " + email);
        }
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }

    // --- Comportamentos adicionados ---
    private boolean validarEmail(String email) {
        return email != null && email.contains("@");
    }

    public String getContatoFormatado() {
        return nome + " | " + email + " | " + telefone;
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando para " + nome + " (" + email + "): " + mensagem);
    }
}
