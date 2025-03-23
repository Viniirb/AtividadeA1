package Questoes;

import java.util.Scanner;

public class Questao02 extends BaseQuestion {
    
    private float base1;
    private float altura1;
    private float base2;
    private float altura2;

    Scanner leitura = new Scanner(System.in);
    
    @Override
    public void Execute() {
        
        System.out.println("Dados do triângulo 01");
        System.out.println("Digite a base do triângulo: ");
        this.base1 = leitura.nextFloat();
        System.out.println("Digite a altura do triângulo: ");
        this.altura1 = leitura.nextFloat();
        System.out.println("----------------------------------");
        System.out.println("Dados do triângulo 02");
        System.out.println("Digite a base do triângulo: ");
        this.base2 = leitura.nextFloat();
        System.out.println("Digite a altura do triângulo: ");
        this.altura2 = leitura.nextFloat();

        System.out.println("A área do triângulo 01 é: " + calculaAreaTriangulo(this.base1, this.altura1));
        System.out.println("A área do triângulo 02 é: " + calculaAreaTriangulo(this.base2, this.altura2));
        System.out.println("A maior área entre os triângulos é: " + comparaTriangulos(calculaAreaTriangulo(10, 20), calculaAreaTriangulo(20, 30)));
    }
    
    private float calculaAreaTriangulo(float base, float altura) {
        return (base * altura) / 2;
    }

    private float comparaTriangulos(float area01, float area02) {
        
        if (area01 > area02) {
            return area01;
        } else if (area01 < area02) {
            return area02;
        } else {
            return 0;
        }
    }
}
