import java.util.Scanner;

public class Exer30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição A - " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        int posB = 0;
        int posC = 0;

        for (int j : vetorA) {
            if (j % 2 == 0) {
                vetorB[posB] = j;
                posB++;
            } else {
                vetorC[posC] = j;
                posC++;
            }
        }

        System.out.print("Vetor A = ");
        for (int j : vetorA) {
            System.out.print(j + " ");
        }
        System.out.println();


        System.out.print("Vetor B = ");
        for (int i = 0; i < posB; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for (int i = 0; i < posC; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}
