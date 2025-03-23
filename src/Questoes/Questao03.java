package Questoes;

import java.util.Scanner;

public class Questao03 extends BaseQuestion {
   
    private float Temp;
    Scanner leitura = new Scanner(System.in);

    @Override
    public void Execute() {
        
        System.out.println("Conversão de temperatura de Celsius para Fahrenheit");
        System.out.println("Digite a temperatura em Celsius: ");
        Temp = leitura.nextFloat();
        System.out.println("A temperatura em Fahrenheit é: " + convertTemperatura(Temp));
        
    }

    private float convertTemperatura(float temp) {
        return temp * 1.8f + 32;
    }
    
}
