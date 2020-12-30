
public class Ordenacao {
	int aux;
	
	void main(String[] args) {
		int[] novoArray = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			novoArray[i] = Integer.parseInt(args[i]);
		}
		
		for(int j = 0; j < novoArray.length; j++){
			for(int k = 0; k < novoArray.length-1; k++){
				if(novoArray[k] > novoArray[k + 1]){
					aux = novoArray[k];
					novoArray[k] = novoArray[k+1];
					novoArray[k+1] = aux;
				}
			}
		}
		
		String listaNumeros = "";
		for (int i = 0; i < novoArray.length; i++) {
			listaNumeros += (String.valueOf(novoArray[i])) + " ";
		}
		System.out.println(listaNumeros);
		
	}
	
}
	
	
		
		

