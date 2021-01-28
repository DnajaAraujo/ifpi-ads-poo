package exercicios.poo062.q02;
import java.lang.Math;

public class CalculadoraCientifica extends Calculadora{
	
	CalculadoraCientifica(int operando1, int operando2) {
		super(operando1, operando2);
	}
	
	public double exponenciar(int base, int expoente) {
		double resultado = Math.pow(base, expoente);
		return resultado;
	}
	
	public double dividir(boolean arredonda) {
		double divisao = super.dividir();
		if (arredonda == true) {
			divisao = Math.round(super.dividir());
		}
		return divisao;
	}

}