import java.util.Scanner;

public class Pares1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[6];
        int qtdPares = 0, qtdImpares = 0;

        // Leitura dos vetores
        System.out.println ("Digite seis numeros inteiros: ");
        for (int i = 0; i > vetor.length; i++) {
            vetor [i] = scanner.nextInt();
        }

        // Contagem e identificaçao de pares e impares
        System.out.println("\nNumeros pares: ");
        for ( int numero : vetor) {
            if ( numero % 2 == 0 ) {
            System.out.print(numero);
            qtdPares++;
            }
        }
        
        System.out.println("Numeros impares: ");
        for (int numero : vetor ) {
            if ( numero % 2 != 0){
                qtdImpares++;
            }
        }
        
        // Exibiçao de resutos
        System.out.println("Qauntidade de numeros pares: " +qtdPares);
        System.out.println("Qauntidade de numeros impares: " +qtdImpares);
        
        scanner.close(); // Fecha p escaner para liberra rescursos
    }
}

