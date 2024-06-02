import java.util.Scanner;
public class SomaSerie11 {

    public static double calcularSomaSerie(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("O número N deve ser inteiro e positivo.");
        }

        double S = 0.0;
        for (int i = 1; i <= N; i++) {
            S += 1.0 / calcularFatorial(i);
        }
        return S;
    }

    // Função auxiliar para calcular o fatorial (similar à questão 8)
    private static long calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N: ");
        int N = scanner.nextInt();

        try {
            double resultado = calcularSomaSerie(N);
            System.out.printf("O valor de S para N = %d é: ", N, resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
