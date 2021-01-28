package exercicios.poo062.q08;

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
	
	@Override
	public double getSalarioPrimeiraParcela() {
		return super.getSalarioPrimeiraParcela() + super.getSalarioSegundaParcela();
	}
	
	@Override
	public double getSalarioSegundaParcela() {
		return super.getSalarioSegundaParcela() - super.getSalarioSegundaParcela();
	}
	
}
