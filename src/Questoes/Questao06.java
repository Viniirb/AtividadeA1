package Questoes;

import java.util.Scanner;

public class Questao06 extends BaseQuestion{
    
    private int horaInicio;
    private int minutoInicio;
    private int horaFim;
    private int minutoFim;
    Scanner leitura = new Scanner(System.in);

    @Override
    public void Execute() {
        
        System.out.println("Digite a hora de inicio do Jogo: ");
        horaInicio = leitura.nextInt();
        System.out.println("Digite o minuto de inicio do Jogo: ");
        minutoInicio = leitura.nextInt();
        System.out.println("Digite a hora de término do Jogo: ");
        horaFim = leitura.nextInt();
        System.out.println("Digite o minuto de término do Jogo: ");
        minutoFim = leitura.nextInt();
        System.out.println("O tempo de jogo foi de: " + calculaDuracaoJogo(horaInicio, minutoInicio, horaFim, minutoFim) + " minutos");
    }

    private int calculaDuracaoJogo(int horaInicio, int minutoInicio, int horaFim, int minutoFim) {
        
        int duracao = 0;
        if (horaInicio == horaFim) {
            duracao = minutoFim - minutoInicio;
        } else if (horaInicio < horaFim) {
            duracao = (horaFim - horaInicio) * 60;
            duracao += minutoFim - minutoInicio;
        } else {
            duracao = (24 - horaInicio + horaFim) * 60;
            duracao += minutoFim - minutoInicio;
        }
        return duracao;
    }
}
