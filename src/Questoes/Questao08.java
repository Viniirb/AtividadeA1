package Questoes;

import java.util.Scanner;

public class Questao08 extends BaseQuestion {
    
    private int option;
    private float valorFinalCarro;
    Scanner leitura = new Scanner(System.in);

    @Override
    public void Execute() {
        
        System.out.println("Informe o valor inicial do Carro:");
        valorFinalCarro = leitura.nextFloat();

        System.out.println("Informe a opção desejada para upgrades no carro:");
        System.out.println("1 - Ar Condicionado: R$ 1.750,00");
        System.out.println("2 - Pintura Metálica: R$ 800,00");
        System.out.println("3 - Direção Hidráulica: R$ 2.000,00");
        System.out.println("4 - Vidros Elétricos: R$ 1.200,00");
        System.out.println("0 - Finalizar");

        do {
            option = leitura.nextInt();
            switch (option) {
                case 1:
                    valorFinalCarro += 1750;
                    break;
                case 2:
                    valorFinalCarro += 800;
                    break;
                case 3:
                    valorFinalCarro += 2000;
                    break;
                case 4:
                    valorFinalCarro += 1200;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (option != 0);
        System.out.println("Valor final do carro: R$ " + valorFinalCarro);

    }
}
