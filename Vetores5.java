import java.util.Scanner;

public class Vetores5 {

    // Função auxiliar para verificar se um número é primo (da "lista 3")
    public static boolean Primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        int[] vetorPrimos = new int[15]; // Vetor resultante (máximo 15 posições)
        int qtdPrimos = 0; // Contador de números primos

        // Leitura dos elementos do vetor
        System.out.println("Digite os 15 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Identificação dos números primos e armazenamento no vetor resultante
        for (int numero : vetor) {
            if (Primo(numero)) {
                vetorPrimos[qtdPrimos] = numero;
                qtdPrimos++;
            }
        }

        // Exibição do vetor resultante
        System.out.println("\nNúmeros primos encontrados:");
        for (int i = 0; i < qtdPrimos; i++) {
            System.out.print(vetorPrimos[i] + " ");
        }

        scanner.close();
    }
}
