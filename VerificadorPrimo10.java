import java.util.Scanner;
public class VerificadorPrimo10 {

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }

        // Otimização: verificar apenas até a raiz quadrada de 'numero'
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false; // Se for divisível por algum número, não é primo
            }
        }

        return true; // Se não encontrou divisores, é primo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (ehPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}

