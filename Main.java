import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        double numero1;
        double numero2;
        Scanner keyboard = new Scanner(System.in);
        Calculadora mathUtils = new Calculadora();

        do {
        System.out.println("Qual tipo de Operação deseja?");
        System.out.println("1. [Soma] 2. [Multiplicação] 3. [Divisão] 4. [Subtração] 0. [Sair]");
        input = keyboard.nextInt();

        switch (input) {
            case 1:
                System.out.println("Primeiro número:");
                numero1 = keyboard.nextInt();
                System.out.println("Segundo Número");
                numero2 = keyboard.nextInt();
                mathUtils.soma(numero1, numero2);
                System.out.println("");
                break;
            case 2:
                System.out.println("Primeiro número:");
                numero1 = keyboard.nextInt();
                System.out.println("Segundo Número");
                numero2 = keyboard.nextInt();
                mathUtils.multiplicacao(numero1, numero2);
                System.out.println("");
                break;
            case 3:
                System.out.println("Primeiro número:");
                numero1 = keyboard.nextInt();
                System.out.println("Segundo Número");
                numero2 = keyboard.nextInt();
                mathUtils.divisao(numero1, numero2);
                System.out.println("");
                break;
            case 4:
                System.out.println("Primeiro número:");
                numero1 = keyboard.nextInt();
                System.out.println("Segundo Número");
                numero2 = keyboard.nextInt();
                mathUtils.subtracao(numero1, numero2);
                System.out.println("");
                break;
            case 0:
                System.exit(0);
                
                break;
            } 
        } while (input != 0);
    }
}