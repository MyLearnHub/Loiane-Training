import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com um número para a posição = " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] < 7) {
                vetorB[i] = 'a';
            } else if (vetorA[i] == 7) {
                vetorB[i] = 'b';
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 'c';
            } else if (vetorA[i] == 10) {
                vetorB[i] = 'd';
            } else if (vetorA[i] > 10) {
                vetorB[i] = 'e';
            }
        }

        System.out.print("Vetor A = ");
        for (int j : vetorA) {
            System.out.print(j + " ");
        }
        System.out.println();


        System.out.print("Vetor B = ");
        for (char c : vetorB) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
