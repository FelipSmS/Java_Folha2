//15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor deacordo
// com a seguinte regra: com exceção do 1º número, só é permitido armazenarum número
// se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximovalor lido só poderá ser maior que 5

import java.util.Scanner;

public class Atv15 {
    public void ExecutarPrograma() {
        Scanner ler = new Scanner(System.in);

        int tamanho = 5;

        int[] vetor = new int[tamanho];

        System.out.print("Digite o primeiro número: ");
        vetor[0] = ler.nextInt();

        for (int i = 1; i < tamanho; i++) {
            System.out.print("Digite o próximo número maior que " + vetor[i - 1] + ": ");
            int numero = ler.nextInt();
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido. Digite um número maior que " + vetor[i - 1] + ".");
                i--;
            }
        }

        System.out.println("Vetor preenchido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
