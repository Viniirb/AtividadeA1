package Questoes;

import java.util.Scanner;

public class Questao09 extends BaseQuestion {
    
    private int option;
    private float valorTotalConta;
    private float totalGastoMetroCubico;
    Scanner leitura = new Scanner(System.in);

    @Override
    public void Execute(){
        System.out.println("Digite a opção desejada: ");
        System.out.println("1 - Residencial");
        System.out.println("2 - Comercial");
        System.out.println("3 - Industrial");
        option = leitura.nextInt();

        switch(option){
            case 1:
                System.out.println("Digite o valor total de m³ consumida: ");
                totalGastoMetroCubico = leitura.nextFloat();
                valorTotalConta = 5 + (totalGastoMetroCubico * 0.05f);
                System.out.println("O valor total da conta é: " + valorTotalConta);
                break;
            case 2:
                System.out.println("Digite o valor total de m³ consumida: ");
                totalGastoMetroCubico = leitura.nextFloat();
                valorTotalConta = 500 + (totalGastoMetroCubico * 0.25f);
                System.out.println("O valor total da conta é: " + valorTotalConta);
                break;
            case 3:
                System.out.println("Digite o valor total de m³ consumida: ");
                totalGastoMetroCubico = leitura.nextFloat();
                valorTotalConta = 800 + (totalGastoMetroCubico * 0.04f);
                System.out.println("O valor total da conta é: " + valorTotalConta);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }

}
