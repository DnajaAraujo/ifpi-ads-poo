
public class Postagem {
	int id;
	String texto;
	int qtdCurtidas;
	
	Postagem(int id, String texto, int qtdCurtidas) {
		this.id = id;
		this.texto = texto;
		this.qtdCurtidas = qtdCurtidas;
	}
	
	void curtir() {
		qtdCurtidas++;
	}
	
	public String toString() {
		return texto + " | " + "curtidas: " + qtdCurtidas;
	}
	
}
