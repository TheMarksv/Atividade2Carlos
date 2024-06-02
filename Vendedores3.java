import java.util.Scanner;

public class Vendedores {

    private static int NumeroVendedores = 10; // Nome da variável alterado
    private double[] vendas = new double[NumeroVendedores];
    private double[] comissoes = new double[NumeroVendedores];
    private String[] nomes = new String[NumeroVendedores];

    public void lerDados(Scanner scanner) {
        for (int i = 0; i < NumeroVendedores; i++) {
            System.out.print("Nome do vendedor " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Total de vendas de " + nomes[i] + ": ");
            vendas[i] = scanner.nextDouble();
            System.out.print("Percentual de comissão de " + nomes[i] + " (%): ");
            comissoes[i] = scanner.nextDouble() / 100; // Converte para decimal
            scanner.nextLine(); // Limpa o buffer do scanner
        }
    }

    public void gerarRelatorio() {
        System.out.println("\nRelatório de Vendas:");
        double totalVendas = 0;
        double maiorValor = 0, menorValor = Double.MAX_VALUE;
        int indiceMaiorValor = 0, indiceMenorValor = 0;

        for (int i = 0; i < NumeroVendedores; i++) {
            double valorReceber = vendas[i] * comissoes[i];
            totalVendas += vendas[i];

            System.out.printf(nomes[i], valorReceber);

            if ( valorReceber > maiorValor) {
                maiorValor = valorReceber;
                indiceMaiorValor = i;
            }
        }

        System.out.printf("Total de vendas: R$", totalVendas);
        System.out.printf( "Maior valor a receber: R$ ", maiorValor, nomes[indiceMaiorValor]);
        System.out.printf("Menor valor a receber: R$ ", menorValor, nomes[indiceMenorValor]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vendedores relatorio = new Vendedores();
        relatorio.lerDados(scanner);
        relatorio.gerarRelatorio();
        scanner.close();
    }
}