import java.util.Scanner;
public class Fatorial8 {

    public static long calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        } else if (n == 0) {
            return 1; // Fatorial de 0 é 1
        } else {
            long fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        try {
            long resultado = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
