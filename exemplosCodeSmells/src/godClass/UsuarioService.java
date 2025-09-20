package godClass;

public class UsuarioService {
    public void cadastrarUsuario(String nome, String email) {
        System.out.println("Usuário cadastrado: " + nome + " - " + email);
    }

    public void removerUsuario(String email) {
        System.out.println("Usuário removido: " + email);
    }
}
