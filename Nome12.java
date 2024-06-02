import java.util.Scanner;
public class Nome12 {

    public static String obterUltimoNome(String nomeCompleto) {
        if (nomeCompleto == null || nomeCompleto.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }

        String[] partesNome = nomeCompleto.trim().split("\\s+"); // Divide o nome em partes usando espaços em branco
        return partesNome[partesNome.length - 1]; // Retorna a última parte (último nome)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        try {
            String ultimoNome = obterUltimoNome(nomeCompleto);
            System.out.println("O último nome é: " + ultimoNome);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
