package Questoes;

import java.util.Scanner;

public class Questao07 extends BaseQuestion {
    
    private int option;
    private float totalConta;
    Scanner leitura = new Scanner(System.in);

    @Override
    public void Execute(){
        
        System.out.println("Informe a opção desejada: ");	
        System.out.println("1 - a vista com 10% de desconto");
        System.out.println("2 - em 2x sem juros");
        System.out.println("3 - em 3x até 10x com 3% de juros ao mês (somente para compras acima de R$ 100,00)");
        option = leitura.nextInt();

        System.out.println("Informe o valor total da conta: ");
        totalConta = leitura.nextFloat();

        calculoConta(totalConta, option);
    }

    private void calculoConta(float totalconta, int option){
        
        switch(option){
            case 1:
                System.out.println("O valor total da conta com 10% de desconto é: " + (totalConta - (totalConta * 0.1)));
                break;
            case 2:
                System.out.println("O valor total da conta em 2x sem juros é: " + (totalConta / 2));
                break;
            case 3:
                if(totalConta > 100){
                    System.out.println("O valor total da conta em 3x até 10x com 3% de juros ao mês é: " + (totalConta + (totalConta * 0.03)));
                }else{
                    System.out.println("O valor total da conta não atingiu o valor mínimo para parcelamento.");
                    break;
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }

}
