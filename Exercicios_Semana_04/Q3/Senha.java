public class Senha {
	String valor;
	
	Senha(String valor) {
		this.valor = valor;
	}
	
	boolean iguais(String valor) {
		return this.valor == valor;
	}
	
	boolean iguaisTrim(String valor) {
		return this.valor.trim().equals(valor.trim());
	}
	
	boolean tamanhoSeguro() {
		return this.valor.length() >= 6; 
	}
	
	boolean possuiMaiusculaMinuscula() {
		boolean possuiMaiuscula = false;
		boolean possuiMinuscula = false;
		
		for (int i = 0; i < valor.length(); i++) {
			if (valor.charAt(i) >= 'a' && valor.charAt(i) <= 'z') {
				possuiMinuscula = true;
			} else if (valor.charAt(i) >= 'A' && valor.charAt(i) <= 'Z') {
				possuiMaiuscula = true;
			} 
			
			if (possuiMinuscula == true && possuiMaiuscula == true) {
				break;
			}
			
		}
		return possuiMinuscula && possuiMaiuscula;
	}
	
	boolean possuiNumero() {
		boolean resultado = false;
		
		for (int i = 0; i < valor.length(); i++) {
			if (valor.charAt(i) >= '0' && valor.charAt(i) <= '9') {
				resultado = true;
				break;
			}
		}
		return resultado;
	}
	
	boolean ehValida() {
		return tamanhoSeguro() && possuiMaiusculaMinuscula() && possuiNumero(); 
	}
}
