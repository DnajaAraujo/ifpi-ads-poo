package exercicios.poo05.q06;

public class Banco {
	private Conta[] contas;
	private int indice = 0;

	public Banco() {
		contas = new Conta[50];
	}

	public Banco(int tamanho) {
		contas = new Conta[tamanho];
	}

	public void inserir(Conta c) {
		if (indice < contas.length) {
			contas[indice] = c;
			indice++;
		}
	}

	public void creditar(String numero, double valor) {
		Conta c1 = consultar(numero);

		if (c1 != null) {
			c1.depositar(valor);
		}
		else {
			System.out.println("Conta não existente!");
		}
	}

	public void transferir(String numCredito, String numDebito, double valor) {
		Conta contaCredito = consultar(numCredito);
		Conta contaDebito = consultar(numDebito);

		if (contaCredito == null) {
			System.out.println("Conta de Credito não existente!");
		}
		if (contaDebito == null) {
			System.out.println("Conta de Debito não existente!");
		}
		else if (contaCredito != null && contaDebito != null) {
			contaCredito.transferir(contaDebito, valor);
		}
		
	}

	public int contarContasCadastradas() {
		int qtdContas = 0;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				qtdContas ++;
			}
		}
		return qtdContas;
	}

	public double contarDinheiroTotal() {
		double qtdDinheiro = 0;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				qtdDinheiro += contas[i].saldo;
			}	
		}
		return qtdDinheiro;
	}

	public double calcularMediaConta() {
		double qtdDinheiro = contarDinheiroTotal();
		int qtdContas = contarContasCadastradas();
		double media = qtdDinheiro / qtdContas;

		return media;
	}
	

	public Conta consultar(String numero) {
		Conta c = null;
		for (int i = 0; i < indice; i++) {
			if (contas[i].numero.equals(numero)) {
				c = contas[i];
				break;
			}
		}
		return c;
	}

	private int consultarIndice(String numero) {
		int pos = -1;
		for (int i = 0; i < indice; i++) {
			if (contas[i].numero.equals(numero)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public void debitar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		if (c != null)
			c.sacar(valor);
		else
			System.out.println("Conta inexistente.");
	}

	public void alterar(Conta c) {
		int indice = consultarIndice(c.numero);
		if (indice != -1) {
			contas[indice] = c;
		}

	}

	public void excluir(String numero) {
		int posicao = consultarIndice(numero);
		if (posicao != -1) {
			for (int i = posicao; i < indice-1; i++) {
				contas[i] = contas[i + 1];
			}
			contas[indice-1] = null;
			indice--;
		}
	}
}