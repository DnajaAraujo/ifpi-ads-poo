
public class Banco {
	Conta[] contas;
	int indice = 0;

	public Banco() {
		contas = new Conta[50];
	}

	public Banco(int tamanho) {
		contas = new Conta[tamanho];
	}

	void inserir(Conta c) {
		if (indice < contas.length) {
			contas[indice] = c;
			indice++;
		}
	}

	void creditar(String numero, double valor) {
		Conta c1 = consultar(numero);

		if (c1 != null) {
			c1.depositar(valor);
		}
		else {
			System.out.println("Conta não existente!");
		}
	}

	void transferir(String numCredito, String numDebito, double valor) {
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

	int contarContasCadastradas() {
		int qtdContas = 0;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				qtdContas ++;
			}
		}
		return qtdContas;
	}

	double contarDinheiroTotal() {
		double qtdDinheiro = 0;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				qtdDinheiro += contas[i].saldo;
			}	
		}
		return qtdDinheiro;
	}

	double calcularMediaConta() {
		double qtdDinheiro = contarDinheiroTotal();
		int qtdContas = contarContasCadastradas();
		double media = qtdDinheiro / qtdContas;

		return media;
	}
	

	Conta consultar(String numero) {
		Conta c = null;
		for (int i = 0; i < indice; i++) {
			if (contas[i].numero.equals(numero)) {
				c = contas[i];
				break;
			}
		}
		return c;
	}

	int consultarIndice(String numero) {
		int pos = -1;
		for (int i = 0; i < indice; i++) {
			if (contas[i].numero.equals(numero)) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	void debitar(String numero, double valor) {
		Conta c;
		c = consultar(numero);
		if (c != null)
			c.sacar(valor);
		else
			System.out.println("Conta inexistente.");
	}

	void alterar(Conta c) {
		int indice = consultarIndice(c.numero);
		if (indice != -1) {
			contas[indice] = c;
		}

	}

	void excluir(String numero) {
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