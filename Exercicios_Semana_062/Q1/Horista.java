package exercicios.poo062.q01;

public class Horista extends Diarista{
	
	public double calcularSalario() {
		double salario = super.calcularSalario() / 24;
		return salario;
	}
	
}
