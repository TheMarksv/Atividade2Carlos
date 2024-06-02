import java.util.Scanner;

public class NumerosIguais {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int [] vetor = new int [15];

        // Leitura dos elementos do vetor
        System.out.println ("Digite 15 numeros inteiros: ");
        for ( int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Verificaçao de elementos iaguais a 30
        System.out.println("Posiçoes com elementos iguais a 30: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 30) {
                System.out.println(i + ""); // Imprime a posiçao (Indice)

            }
        }
        scanner.close();
    }
}

