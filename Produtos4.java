import java.util.Scanner;

public class Produtos4 {
    private static final int NUM_PRODUTOS = 5; // static final em vez de final int

    private String[] nomesProdutos = new String[NUM_PRODUTOS];
    private double[] precosProdutos = new double[NUM_PRODUTOS];

    public void lerDados(Scanner scanner) {
        for (int i = 0; i < NUM_PRODUTOS; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            nomesProdutos[i] = scanner.nextLine();
            System.out.print("Preço de " + nomesProdutos[i] + ": R$ ");
            precosProdutos[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer
        }
    }

    public void analisarPrecos() {
        int produtosAbaixo50 = 0;
        System.out.println("\nProdutos com preço entre R$ 50,00 e R$ 100,00:");
        double somaPrecosAcima100 = 0;
        int qtdPrecosAcima100 = 0;

        for (int i = 0; i < NUM_PRODUTOS; i++) {
            if (precosProdutos[i] < 50) {
                produtosAbaixo50++;
            } else if (precosProdutos[i] <= 100) {
                System.out.println("- " + nomesProdutos[i]);
            } else {
                somaPrecosAcima100 += precosProdutos[i];
                qtdPrecosAcima100++;
            }
        }

        System.out.println("\nQuantidade de produtos com preço inferior a R$ 50,00: " + produtosAbaixo50);

        if (qtdPrecosAcima100 > 0) {
            double mediaPrecosAcima100 = somaPrecosAcima100 / qtdPrecosAcima100;
            System.out.printf("Média dos preços dos produtos acima de R$ 100,00: R$ %.2f\n", mediaPrecosAcima100);
        } else {
            System.out.println("Não há produtos com preço superior a R$ 100,00.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produtos4 analisador = new Produtos4();
        analisador.lerDados(scanner);
        analisador.analisarPrecos();
        scanner.close();
    }
}

