import java.util.Scanner;

public class Exer26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com um número para a posição A = " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre com um número para a posição A = " + i + ":");
            vetorB[i] = scan.nextInt();

            if (vetorA[i] == vetorB[i]) {
                vetorC[i] = 0;
            } else if (vetorA[i] > vetorB[i]) {
                vetorC[i] = 1;
            } else {
                vetorC[i] = -1;
            }
        }

        System.out.print("Vetor A = ");
        for (int value : vetorA) {
            System.out.print(value + " ");
        }
        System.out.println();


        System.out.print("Vetor B = ");
        for (int i : vetorB) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Vetor C = ");
        for (int j : vetorC) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
