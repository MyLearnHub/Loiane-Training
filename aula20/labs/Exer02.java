import java.util.Random;

public class Exer02 {
    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }

        for (int[] numerosAleatorio : numerosAleatorios) {
            for (int i : numerosAleatorio) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 5;
        for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
            if (numerosAleatorios[linha5][i] > maiorL5) {
                maiorL5 = numerosAleatorios[linha5][i];
            }
            if (numerosAleatorios[linha5][i] < menorL5) {
                menorL5 = numerosAleatorios[linha5][i];
            }
        }

        System.out.println("Maior valor da linha 5 = " + maiorL5);
        System.out.println("Menor valor da linha 5 = " + menorL5);

        int maiorC7 = 0;
        int menorC7 = 101;
        int col7 = 7;
        for (int[] numerosAleatorio : numerosAleatorios) {
            if (numerosAleatorio[col7] > maiorC7) {
                maiorC7 = numerosAleatorio[col7];
            }
            if (numerosAleatorio[col7] < menorC7) {
                menorC7 = numerosAleatorio[col7];
            }
        }

        System.out.println("Maior valor da coluna 7 = " + maiorC7);
        System.out.println("Menor valor da coluna 7 = " + menorC7);
    }
}
