
public class TestaMicroblog {

	public static void main(String[] args) {
		Microblog m = new Microblog(3);
		
		Postagem p1 = new Postagem(1, "Ola!", 4);
		Postagem p2 = new Postagem(2, "Bom dia", 1);
		Postagem p3 = new Postagem(3, "Boa tarde", 7);
		Postagem p4 = new Postagem(4, "Boa noite 2", 0);
		m.incluirPostagem(p1);
		m.incluirPostagem(p2);
		m.incluirPostagem(p3);
		m.incluirPostagem(p4);
		m.curtir(1);
		m.curtir(2);
		m.curtir(3);
		m.excluirPostagem(2);
		m.incluirPostagem(p4);
		m.curtir(4);
		m.curtir(4);
		m.curtir(4);
		m.curtir(4);
		m.curtir(4);
		m.curtir(4);
		m.curtir(4);
		System.out.println("Postagem mais curtida: " + m.retornarMaisCurtida());
		
		

	}

}
