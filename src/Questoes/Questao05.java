package Questoes;

import java.util.Scanner;

public class Questao05 extends BaseQuestion {
    
    private int qtdMacas;
    private int qtdMorangos;
    private float precoMacas;
    private float precoMorangos;
    private float precoTotalCompra;
    Scanner leitura = new Scanner(System.in);

    @Override
    public void Execute() {
        
        System.out.println("Compra de frutas");
        System.out.println("Digite a quantidade de maçãs: ");
        qtdMacas = leitura.nextInt();
        System.out.println("Digite a quantidade de morangos: ");
        qtdMorangos = leitura.nextInt();
        
        precoMacas = (qtdMacas <= 5) ? 3.5f : 2.0f;
        precoMorangos = (qtdMorangos <= 5) ? 7.5f : 5.3f;
        precoTotalCompra = precoMacas + precoMorangos;
        
        System.out.println("O Valor a ser pago e: " + calculaPrecoCompra(qtdMacas + qtdMorangos, precoTotalCompra));

    }

    private float calculaPrecoCompra(int qtdFrutas, float valorTotal){
        return qtdFrutas < 5 && valorTotal > 19.0f ? valorTotal * 0.8f : valorTotal;
    }
}
