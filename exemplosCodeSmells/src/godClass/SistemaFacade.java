package godClass;

//Agora, um "fachada" (Facade) para orquestrar os serviços
public class SistemaFacade {
 private UsuarioService usuarioService = new UsuarioService();
 private EmailService emailService = new EmailService();
 private RelatorioService relatorioService = new RelatorioService();
 private PagamentoService pagamentoService = new PagamentoService();

 public void executar() {
     usuarioService.cadastrarUsuario("João", "joao@email.com");
     emailService.enviarEmail("joao@email.com", "Bem-vindo ao sistema!");
     relatorioService.gerarRelatorioFinanceiro();
     pagamentoService.processarPagamento("Cartão", 250.0);
 }
}
