//4. Elabore um programa que leia um vetor de 5 números digitados pelo usuário e umavariável de um número n qualquer,
// depois mostre na tela o índice dos elementos quesão inferiores a n

import java.util.Scanner;

public class Atv4 {
    public void ExecutarPrograma() {
        Scanner ler = new Scanner(System.in);

        int tamanho = 5;

        int[] vetor = new int[tamanho];

        System.out.println("Digite os números para o vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = ler.nextInt();
        }

        System.out.print("Digite o número n: ");
        int n = ler.nextInt();

        System.out.println("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] < n) {

                System.out.println("Índice " + i);
            }
        }
    }
}
