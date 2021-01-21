public class TestaCalculadora {

    public static void main(String[] args) {

        Calculadora c1 = new Calculadora(1, 6);
        c1.operando1 = 8; // Ocorre erro: "The field Calculadora.operando1 is not visible"
        c1.operando2 = 2; // Ocorre erro: "The field Calculadora.operando2 is not visible"

        int soma = c1.somar();
        int subtracao = c1.subtrair();

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
    }
}