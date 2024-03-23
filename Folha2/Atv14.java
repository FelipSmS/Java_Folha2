//14. Faça um programa que leia um vetor de 5 elementos e, após a leitura,
//posicioneo maior elemento na última posição do vetor. Nenhum número do vetor
// pode serapagado ou duplicado. Apresente o vetor atualizado na tela

import java.util.Scanner;

public class Atv14 {
    public void ExecutarPrograma() {
        Scanner ler = new Scanner(System.in);
        int tamanho = 5;

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = ler.nextInt();
        }

        int indiceMaior = 0;
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        int maiorElemento = vetor[indiceMaior];
        for (int i = indiceMaior; i < tamanho - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        vetor[tamanho - 1] = maiorElemento;

        System.out.println("Vetor atualizado:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
