
public class TestaPilha {

	public static void main(String[] args) {
		int[] pil = {1 , 2, 4, 7, 8};
		
		Pilha p = new Pilha(pil);
		
		System.out.println(p.estaCheia());
		p.desempilhar();
		p.desempilhar();
		p.desempilhar();
		p.desempilhar();
		p.desempilhar();
		p.desempilhar();
		System.out.println(p.estaCheia());
		p.empilhar(11);
		p.empilhar(22);
		p.empilhar(33);
		p.empilhar(44);
		p.empilhar(55);
		p.empilhar(66);
		p.desempilhar();
		p.empilhar(66);
		System.out.println(p.retornarTopo());
		System.out.println(p.exibir());
		
	}

}
