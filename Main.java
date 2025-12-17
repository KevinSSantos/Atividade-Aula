import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variável que armazena a opção escolhida no menu
        int input;

        // Variáveis para armazenar os números das operações
        double numero1;
        double numero2;

        // Scanner para ler dados digitados pelo usuário
        Scanner keyboard = new Scanner(System.in);

        // Objeto da classe Calculadora, responsável pelas operações matemáticas
        Calculadora mathUtils = new Calculadora();

        // Loop que mantém o programa rodando até o usuário escolher sair
        do {
            // Exibe o menu de opções
            System.out.println("Qual tipo de Operação deseja?");
            System.out.println("1. [Soma] 2. [Multiplicação] 3. [Divisão] 4. [Subtração] 0. [Sair]");

            // Lê a opção escolhida pelo usuário
            input = keyboard.nextInt();

            // Decide qual operação será executada
            switch (input) {

                case 1: // Soma
                    System.out.println("Primeiro número:");
                    numero1 = keyboard.nextInt();

                    System.out.println("Segundo Número");
                    numero2 = keyboard.nextInt();

                    // Chama o método de soma
                    mathUtils.soma(numero1, numero2);
                    System.out.println("");
                    break;

                case 2: // Multiplicação
                    System.out.println("Primeiro número:");
                    numero1 = keyboard.nextInt();

                    System.out.println("Segundo Número");
                    numero2 = keyboard.nextInt();

                    // Chama o método de multiplicação
                    mathUtils.multiplicacao(numero1, numero2);
                    System.out.println("");
                    break;

                case 3: // Divisão
                    System.out.println("Primeiro número:");
                    numero1 = keyboard.nextInt();

                    System.out.println("Segundo Número");
                    numero2 = keyboard.nextInt();

                    // Chama o método de divisão
                    mathUtils.divisao(numero1, numero2);
                    System.out.println("");
                    break;

                case 4: // Subtração
                    System.out.println("Primeiro número:");
                    numero1 = keyboard.nextInt();

                    System.out.println("Segundo Número");
                    numero2 = keyboard.nextInt();

                    // Chama o método de subtração
                    mathUtils.subtracao(numero1, numero2);
                    System.out.println("");
                    break;

                case 0: // Encerra o programa
                    System.exit(0);
                    break;
            }

        } while (input != 0); // Repete enquanto não for escolhida a opção sair
    }
}
