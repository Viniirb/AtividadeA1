package Questoes;

import java.util.Scanner;

public class Questao01 extends BaseQuestion {

    private Integer number01;
    private Integer number02;
    Scanner leitura = new Scanner(System.in);

    @Override
    public void Execute() {
        
        System.out.println("Digite o primeiro número: ");
        this.number01 = leitura.nextInt();
        System.out.println("Digite o segundo número: ");
        this.number02 = leitura.nextInt();

        if (this.number01 > this.number02) {
            System.out.println("O número " + this.number01 + " é maior que o número " + this.number02);
        } else if (this.number01 < this.number02) {
            System.out.println("O número " + this.number02 + " é maior que o número " + this.number01);
        } else {
            System.out.println("Os números são iguais");
        }
    }
    
}
