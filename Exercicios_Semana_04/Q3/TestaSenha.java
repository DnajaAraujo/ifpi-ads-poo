
public class TestaSenha {

	public static void main(String[] args) {
		Senha senha = new Senha("311220F");
		System.out.println("Senhas iguais: " + senha.iguais(" 311220Ff "));
		System.out.println("Senhas iguais trim: " + senha.iguaisTrim(" 311220Ff "));
		System.out.println("Tamanho seguro: " + senha.tamanhoSeguro());
		System.out.println("Possui letras maiusculas e minusculas: " + senha.possuiMaiusculaMinuscula());
		System.out.println("Possui numero: " + senha.possuiNumero());
		System.out.println("Senha é válida: : " + senha.ehValida());
	}

}
