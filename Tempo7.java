import java.util.Scanner;
public class Tempo7 {

    public static int converterParaSegundos(int horas, int minutos, int segundos) {
        if (horas < 0 || minutos < 0 || segundos < 0) {
            throw new IllegalArgumentException("Horas, minutos e segundos devem ser valores não negativos.");
        }

        int totalSegundos = horas * 3600 + minutos * 60 + segundos;
        return totalSegundos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        int horas = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        try {
            int totalSegundos = converterParaSegundos(horas, minutos, segundos);
            System.out.println(horas + "h " + minutos + "min " + segundos + "s correspondem a " + totalSegundos + " segundos.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}