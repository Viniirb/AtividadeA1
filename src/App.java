import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            limparTela();
            System.out.println("==================================");
            System.out.println("          LISTAGEM DE QUESTÕES    ");
            System.out.println("==================================");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " - Questão " + i);
            }
            System.out.println("0 - Sair");
            System.out.println("==================================");
            System.out.print("\nEscolha uma questão para executar: ");

            int escolha;
            try {
                escolha = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nOpção inválida! Tente novamente.\n");
                continue;
            }

            if (escolha == 0) {
                continuar = false;
                System.out.println("\nSaindo do programa...\n");
            } else if (escolha >= 1 && escolha <= 10) {
                limparTela();
                System.out.println("==================================");
                System.out.println("         EXECUTANDO QUESTÃO " + escolha + "         ");
                System.out.println("==================================\n");
                try {
                    Class<?> classe = Class.forName("Questoes.Questao0" + escolha);
                    Object instancia = classe.getDeclaredConstructor().newInstance();
                    classe.getMethod("Execute", Scanner.class).invoke(instancia, scanner);
                } catch (NoSuchMethodException e) {
                    try {
                        Class<?> classe = Class.forName("Questoes.Questao0" + escolha);
                        Object instancia = classe.getDeclaredConstructor().newInstance();
                        classe.getMethod("Execute").invoke(instancia);
                    } catch (Exception ex) {
                        System.out.println("\nErro ao executar a questão " + escolha + ": " + ex.getMessage() + "\n");
                    }
                } catch (Exception e) {
                    System.out.println("\nErro ao executar a questão " + escolha + ": " + e.getMessage() + "\n");
                }

                System.out.println("\nPressione ENTER para voltar ao menu...");
                scanner.nextLine();
            } else {
                System.out.println("\nOpção inválida! Tente novamente.\n");
            }
        }

        scanner.close();
    }

    private static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Erro ao limpar a tela.");
        }
    }
}
