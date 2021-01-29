package br.edu.ifpi.poo.banco.testes;

import br.edu.ifpi.poo.banco.cadastros.Banco;
import br.edu.ifpi.poo.banco.entidade.AplicacaoException;
import br.edu.ifpi.poo.banco.entidade.Conta;
import br.edu.ifpi.poo.banco.entidade.ContaImposto;
import br.edu.ifpi.poo.banco.entidade.Poupanca;

public class TestaBanco {
	public static void main(String[] args) {
		//Banco b = new Banco(3);
		Banco b = new Banco();
		Conta c1 = new Conta("1", 100);
		Conta c2 = new Conta("2", 1000);
		Poupanca c3 = new Poupanca("3", 1000, 2);
		ContaImposto c4 = new ContaImposto("4", 200);
		
		try {
			//b.consultar("4");
			//b.creditar("1", 200);
			//b.debitar("1", 50);
			//b.transferir("1", "2", 100);
			//b.renderJuros("1");
			//c2.sacar(1000);
			//c2.sacar(0);
			//c2.depositar(-1);
			
			b.inserir(c1);
			b.inserir(c2);
			b.inserir(c3);
			b.inserir(c4);
			
			b.creditar("1", 200);
			b.debitar("1", 50);
			b.transferir("2", "1", 100);
			b.renderJuros("3");
			b.debitar("4", 100);
			
			c2.depositar(100);
			c2.sacar(150);
			
			
		} 
		
		catch (AplicacaoException e) {
			System.out.println("Erro - tipo 1");
			System.out.println("Exceção capturada: " + e.getMessage());
		} 
		
		catch (Exception e) {
			System.out.println("Erro - tipo 2");
			System.out.println("Erro inesperado: " + e.getMessage());
		}
		
		System.out.println("Programa finalizado com sucesso");
		
	}
}
