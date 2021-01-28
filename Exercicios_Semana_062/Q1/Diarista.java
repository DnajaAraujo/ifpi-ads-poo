package exercicios.poo062.q01;

public class Diarista extends Empregado{
	
	public double calcularSalario() {
		double salario = super.calcularSalario() / 30;
		return salario;
	}
	
}
