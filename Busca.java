import java.util.Random;
import java.util.Scanner;

public class Busca {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] vetA = new int[100];

        alimentarArray(vetA);
        System.out.println("Digite um numero a ser buscado no vetor: ");
        buscarNum(vetA, teclado.nextInt());
    }

    public static void buscarNum(int[] vetA, int num) {

        for (int i = 0; i < vetA.length; i++) {
            if (num == vetA[i]) {
                System.out.println("Elemento " + num + " foi encontrado no indice " + i);
                return;
            }
        }

        System.out.println("Elemento " + num + " não existe no vetor");
    }

    public static void alimentarArray(int[] vetA) {
        Random r = new Random();
        int low = 0;
        int high = 100;

        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = r.nextInt(high - low) + low;
            System.out.println(vetA[i]);
        }

    }

}