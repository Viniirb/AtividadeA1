package Questoes;

import java.util.Scanner;

public class Questao04  extends BaseQuestion {
    
    private int numAlunos;
    private int numAlunas;
    Scanner leitura = new Scanner(System.in);

    @Override
    public void Execute() {
        
        System.out.println("Porcentagem de alunos e alunas");
        System.out.println("Digite o número de alunos: ");
        numAlunos = leitura.nextInt();
        System.out.println("Digite o número de alunas: ");
        numAlunas = leitura.nextInt();
        comparaQuantidade(numAlunos, numAlunas);
    }

    private void comparaQuantidade(int num1, int num2) {
        
        if (num1 > num2) {
            System.out.println(" O numero de Alunos é maior que o numero de alunas");
        } else if (num1 < num2) {
            System.out.println(" O numero de Alunas é maior que o numero de alunos");
        } else {
            System.out.println(" O numero de Alunos é igual ao numero de alunas");
        } 
    }
}
