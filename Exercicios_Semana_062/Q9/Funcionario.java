package exercicios.poo062.q09;

public class Funcionario extends Pessoa{
	private int matricula;
	private double salario;
	
	Funcionario() {
		
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
		}
	}
	
	public double getSalarioPrimeiraParcela() {
		double primeiraParcela = getSalario() * 0.6;
		return primeiraParcela;
	}
	
	public double getSalarioSegundaParcela() {
		double segundaParcela = getSalario() * 0.4;
		return segundaParcela;
	}
	
}
