package longMethod;

public class RelatorioFinanceiroRefatorado {

    public void gerarRelatorio() {
        System.out.println("Iniciando relatório financeiro...");
        coletarDados();
        processarDados();
        formatarRelatorio();
        imprimirRelatorio();
    }

    private void coletarDados() {
        System.out.println("Buscando dados de vendas...");
        // código de busca de vendas

        System.out.println("Buscando dados de despesas...");
        // código de busca de despesas

        System.out.println("Buscando dados de impostos...");
        // código de busca de impostos
    }

    private void processarDados() {
        System.out.println("Calculando lucros...");
        // código de cálculo
    }

    private void formatarRelatorio() {
        System.out.println("Formatando relatório...");
        // código de formatação
    }

    private void imprimirRelatorio() {
        System.out.println("Imprimindo relatório final...");
        // código de impressão
    }
}

