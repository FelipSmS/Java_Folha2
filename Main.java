
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a atividade que deseja rodar (1 a 20): ");
        int atividade = ler.nextInt();

        switch (atividade) {
            case 1:
                Atv1 atv1 = new Atv1();
                atv1.ExecutarPrograma();
                break;
            case 2:
                Atv2 atv2 = new Atv2();
                atv2.ExecutarPrograma();
                break;
            case 3:
                Atv3 atv3 = new Atv3();
                atv3.ExecutarPrograma();
                break;
            case 4:
                Atv4 atv4 = new Atv4();
                atv4.ExecutarPrograma();
                break;
            case 5:
                Atv5 atv5 = new Atv5();
                atv5.ExecutarPrograma();
                break;
            case 6:
                Atv6 atv6 = new Atv6();
                atv6.ExecutarPrograma();
                break;
            case 7:
                Atv7 atv7 = new Atv7();
                atv7.ExecutarPrograma();
                break;
            case 8:
                Atv8 atv8 = new Atv8();
                atv8.ExecutarPrograma();
                break;
            case 9:
                Atv9 atv9 = new Atv9();
                atv9.ExecutarPrograma();
                break;
            case 10:
                Atv10 atv10 = new Atv10();
                atv10.ExecutarPrograma();
                break;
            case 11:
                Atv11 atv11 = new Atv11();
                atv11.ExecutarPrograma();
                break;
            case 12:
                Atv12 atv12 = new Atv12();
                atv12.ExecutarPrograma();
                break;
            case 13:
                Atv13 atv13 = new Atv13();
                atv13.ExecutarPrograma();
                break;
            case 14:
                Atv14 atv14 = new Atv14();
                atv14.ExecutarPrograma();
                break;
            case 15:
                Atv15 atv15 = new Atv15();
                atv15.ExecutarPrograma();
                break;
            default:
                System.out.println("Atividade inválida.");
                break;
        }
    }
}
