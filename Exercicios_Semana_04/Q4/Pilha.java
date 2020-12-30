public class Pilha {
	int[] pilha = new int[5];
	
	
	Pilha(int[] pilha) {
		this.pilha = pilha;
	}
	
	
	void empilhar(int numero) { 
		int[] novaPilha = new int[pilha.length+1];
		
		if (estaCheia() == false) {
			for (int i = 0; i < pilha.length; i++) {
				novaPilha[i] = pilha[i];
			}
			novaPilha[pilha.length] = numero;
			pilha = novaPilha;
			
		} 
		else {
			System.out.println("A pilha j� est� cheia!");
		}
		
	}
	
	
	boolean estaCheia() {
		return (pilha.length == 5);
	}
	
	
	void desempilhar() {
		
		if (pilha.length > 0) {
			int[] novaPilha = new int[pilha.length-1];
			
			for (int i = 0; i < pilha.length-1; i++) {
				novaPilha[i] = pilha[i];
			}
			pilha = novaPilha;
		}
		else {
			System.out.println("A pilha j� est� vazia!");
		}
		
	}
	
	
	int retornarTopo() {
		return pilha[pilha.length-1];
	}
	
	
	String exibir() { 
		String pilhaString = "";
		
		for (int i = 0; i < pilha.length; i++) {
			pilhaString += (String.valueOf(pilha[i]) + " ");
		}
		return pilhaString;
	}
	
}
