public class Calculadora {

    // Método responsável por realizar a soma de dois números
    public void soma(double n1, double n2) {
        double soma = n1 + n2;   // Calcula a soma
        System.out.println(soma); // Exibe o resultado
    }

    // Método responsável por realizar a divisão
    public void divisao(double n1, double n2) {
        try {
            // Verifica se o divisor é zero
            if (n2 == 0) {
                // Lança uma exceção caso a divisão não seja possível
                throw new ArithmeticException("Número não divisível");
            }

            double divisao = n1 / n2; // Calcula a divisão
            System.out.println(divisao); // Exibe o resultado

        } catch (ArithmeticException e) {
            // Captura o erro de divisão por zero e exibe a mensagem
            System.out.print("Erro: " + e.getMessage());
        }
    }

    // Método responsável por realizar a multiplicação
    public void multiplicacao(double n1, double n2) {
        double multiplicacao = n1 * n2; // Calcula a multiplicação
        System.out.println(multiplicacao); // Exibe o resultado
    }

    // Método responsável por realizar a subtração
    public void subtracao(double n1, double n2) {
        double subtracao = n1 - n2; // Calcula a subtração
        System.out.println(subtracao); // Exibe o resultado
    }
}
