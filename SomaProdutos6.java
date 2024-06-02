import java.util.Scanner;
public class SomaProdutos6 {

    public static int calcularSoma(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("O número N deve ser inteiro e positivo.");
        }

        int soma = 0;
        for (int i = 1; i <= N; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int N = scanner.nextInt();

        try {
            int resultado = calcularSoma(N);
            System.out.println("A soma dos números de 1 a " + N + " é: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
