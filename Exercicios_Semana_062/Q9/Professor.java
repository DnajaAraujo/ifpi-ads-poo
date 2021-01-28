package exercicios.poo062.q09;

public class Professor extends Funcionario{
	private String titulacao;
	
	Professor() {
		
	}
	
	public String getTitulacao() {
		return titulacao;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public double getSalarioPrimeiraParcela() {
		return super.getSalarioPrimeiraParcela() + super.getSalarioSegundaParcela();
	}
	
	public double getSalarioSegundaParcela() {
		return super.getSalarioSegundaParcela() - super.getSalarioSegundaParcela();
	}
	
}
