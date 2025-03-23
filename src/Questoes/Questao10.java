package Questoes;

import java.util.Scanner;

public class Questao10 extends BaseQuestion {
    
    private float salarioMinimo;
    private int numeroDependentes;
    private float salarioFuncionario;
    private float taxaImposto;
    private float impostoBruto;
    private float impostoLiquido;
    Scanner leitura = new Scanner(System.in);
    
    @Override
    public void Execute() {

        System.out.println("Digite o valor do salário mínimo: ");
        salarioMinimo = leitura.nextFloat();

        System.out.println("Digite o valor do salário do funcionário: ");
        salarioFuncionario = leitura.nextFloat();

        System.out.println("Digite o número de dependentes: ");
        numeroDependentes = leitura.nextInt();

        System.out.println("Digite a taxa de imposto já paga pelo funcionário: ");
        taxaImposto = leitura.nextFloat();

        impostoBruto= calculaImpostoBruto(salarioFuncionario, salarioMinimo);
        impostoLiquido = calculaImpostoLiquido(impostoBruto, numeroDependentes, taxaImposto);

        System.out.println("O imposto de renda a ser pago pelo funcionário é : " + impostoLiquido);
    }

    private float calculaImpostoBruto(float salario, float salarioMinimo) {
        if (salario > 12 * salarioMinimo) {
            return 0.20f * salario;
        } else if (salario > 5 * salarioMinimo) {
            return 0.08f * salario;
        }
        return 0;
    }

    private float calculaImpostoLiquido(float impostoBruto, int dependentes, float impostoPago) {
        float descontoDependentes = dependentes * 400;
        float impostoComDesconto = Math.max(impostoBruto - descontoDependentes, 0);

        float taxaAdicional = 0.04f * impostoBruto;
        float impostoFinal = impostoComDesconto + taxaAdicional - impostoPago;

        return Math.max(impostoFinal, 0);
    }
}
