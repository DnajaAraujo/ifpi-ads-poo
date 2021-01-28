package exercicios.poo062.q02;

public class TestaCalculadora {

	public static void main(String[] args) {
		CalculadoraCientifica c1 = new CalculadoraCientifica(15, 2);
		System.out.println(c1.somar());
		System.out.println(c1.subtrair());
		System.out.println(c1.dividir(true));
	}

}
