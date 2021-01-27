package exercicios.poo05.q02;
import java.util.Scanner;

public class ExecutaBanco {

	public static void main(String[] args) {
		Banco b = new Banco();
		Scanner sc = new Scanner(System.in);
		String opcao = "";
		
		do {
			System.out.println("\n----- Menu -----");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Alterar");
			System.out.println("3 - Excluir");
			System.out.println("4 - Consultar");
			System.out.println("5 - Creditar");
			System.out.println("6 - Debitar");
			System.out.println("7 - Transferir");
			System.out.println("8 - Ver saldo");
			System.out.println("9 - Sair");
			System.out.println("-----------------");
			System.out.print("Digite a opção: ");
			opcao = sc.next();
			
			Conta c = new Conta();
			switch(opcao) {
				
				case "1" : // Cadastrar
					System.out.print("Digite o número da conta: ");
					c.numero = sc.next();
						
					System.out.print("Digite o saldo: R$ ");
					c.saldo = sc.nextDouble();
					b.inserir(c);
					break;
						
						
				case "2" : // Alterar
					System.out.print("Digite o número da conta: ");
					c.numero = sc.next();
					
					System.out.print("Digite o saldo: R$ ");
					c.saldo = sc.nextDouble();
					b.alterar(c);
					break;
						
						
				case "3" : // Excluir
					System.out.print("Digite o número da conta: ");
					c.numero = sc.next();
					b.excluir(c.numero);
					break;
						
						
				case "4" : // Consultar
					System.out.print("Digite o número da conta: ");
					c.numero = sc.next();
					
					if (b.consultar(c.numero) != null) {
						System.out.println("Conta existente!");
					}
					else {
						System.out.println("Conta inexistente!");
					}
					break;
						
						
				case "5" : // Creditar
					System.out.print("Digite o número da conta: ");
					c.numero = sc.next();
						
					System.out.print("Digite o valor que deseja creditar: R$ ");
					double valorCredito = sc.nextDouble();
					b.creditar(c.numero, valorCredito);
					break;
						
						
				case "6" : // Debitar
					System.out.print("Digite o número da conta: ");
					c.numero = sc.next();
						
					System.out.print("Digite o valor que deseja debitar: R$ ");
					double valorDebito = sc.nextDouble();
					b.debitar(c.numero, valorDebito);
					break;
					
					
				case "7" : // Transferir
					System.out.print("Digite o número da conta de credito: ");
					String numeroDebito = sc.next();
					System.out.print("Digite o número da conta de debito: ");
					String numeroCredito = sc.next();
						
					System.out.print("Digite o valor que deseja transferir: R$ ");
					double valorTransferencia = sc.nextDouble();
					b.transferir(numeroCredito, numeroDebito, valorTransferencia);
					break;
				
					
				case "8" : // Ver saldo
					System.out.print("Digite o número da conta: ");
					c.numero = sc.next();
					b.mostrarSaldo(c.numero);
					break;
					
			}
			
		}
		while(!opcao.equals("9"));
		System.out.println("Encerrando Menu...");
		System.out.println("Menu encerrado!");
	}

}
