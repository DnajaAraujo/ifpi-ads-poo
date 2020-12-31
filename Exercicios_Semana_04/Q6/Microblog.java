
public class Microblog {
	Postagem[] postagens;
	int indice = 0;
	
	Microblog(int tamanho) {
		postagens = new Postagem[tamanho];
	}
	
	void incluirPostagem(Postagem p) {
		if (indice < postagens.length) {
			postagens[indice] = p;
			indice++;
		}
		else {
			System.out.println("Não é possível incluir novas postagens!");
		}
	}
	
	int consultarIndice(int id) {
		int pos = -1;
		for (int i = 0; i < indice; i++) {
			if (postagens[i].id == id) {
				pos = i;
				break;
			}
		}
		return pos;
	}
	
	void excluirPostagem(int id) {
		int posicao = consultarIndice(id);
		if (posicao != -1) {
			for (int i = posicao; i < indice-1; i++) {
				postagens[i] = postagens[i+1];
			}
			postagens[indice-1] = null;
			indice--;
		}
	}
	
	Postagem retornarMaisCurtida() {
		Postagem maisCurtida = null;
		int curtidas = 0;
		
		for (int i = 0; i < indice; i++) {
			if (curtidas < postagens[i].qtdCurtidas) {
				curtidas = postagens[i].qtdCurtidas;
				maisCurtida = postagens[i];
			}
		}
		return maisCurtida;
	}
	
	void curtir(int id) {
		int idx = consultarIndice(id);
		if (idx != -1) {
			postagens[idx].curtir();
		}
	}
	
}
