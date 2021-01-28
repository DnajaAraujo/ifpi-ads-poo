package exercicios.poo062.q09;

public class Testes {

	public static void main(String[] args) {
		
		Pessoa p0 = new Pessoa();
		p0.setNome("José");
		p0.setSobrenome("Alcântara");
		System.out.println(p0.getNomeCompleto());
		
		
		Funcionario f1 = new Funcionario();
		f1.setMatricula(1);
		f1.setNome("Maria");
		f1.setSobrenome("Silva");
		f1.setSalario(1000);
		System.out.println(f1.getNomeCompleto());
		System.out.println(f1.getSalarioPrimeiraParcela());
		System.out.println(f1.getSalarioSegundaParcela());
		
		
	
		Professor p1 = new Professor();
		p1.setMatricula(1);
		p1.setNome("Gabriel");
		p1.setSobrenome("Sousa");
		p1.setSalario(1000);
		p1.setTitulacao("Doutor");
		System.out.println(p1.getNomeCompleto());
		System.out.println(p1.getSalarioPrimeiraParcela());
		System.out.println(p1.getSalarioSegundaParcela());
		

	}

}
