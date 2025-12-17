public class Calculadora {
    public void soma(double n1, double n2) {
        double soma = n1 + n2;
        System.out.println(soma);
    }

    public void divisao(double n1, double n2) {
        try {
            if (n2 ==  0 ) {
                throw new ArithmeticException("Número não divisivel");
            }
        double divisao = n1 / n2;
        System.out.println(divisao);
        } catch (ArithmeticException e) {
            System.out.print("Erro: " + e.getMessage());
        } 
    }

    public void multiplicacao(double n1, double n2) {
        double multiplicacao = n1 * n2;
        System.out.println(multiplicacao);
    }

    public void subtracao(double n1, double n2) {
        double subtracao = n1 - n2;
        System.out.println(subtracao);
    }
}
