//2. Escreva um algoritmo que leia em um vetor uma sequência finita de númerosdigitados pelo usuário e,
//logo após, mostre o número de cada posição do vetor e seele é positivo, negativo ou zero

import java.util.Scanner;

public class Atv2 {
    public void ExecutarPrograma() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = ler.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os números para o vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = ler.nextInt();
        }

        System.out.println("Número na posição | Positivo/Negativo/Zero");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": " + vetor[i] + " | ");
            if (vetor[i] > 0) {
                System.out.println("Positivo");
            } else if (vetor[i] < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }
    }
}
