
import java.util.Scanner;

public class Volume9 {

    public static double calcularVolumeEsfera(double raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("O raio deve ser não negativo.");
        }

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        return volume;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        try {
            double volume = calcularVolumeEsfera(raio);
            System.out.printf("O volume da esfera com raio %.2f é: %.2f\n", raio, volume);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
