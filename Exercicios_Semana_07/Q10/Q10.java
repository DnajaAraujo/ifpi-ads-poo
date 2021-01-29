import java.util.Scanner;
import java.util.InputMismatchException;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			try {
				System.out.print("Digite o numerador: ");
				int num = sc.nextInt();
				System.out.print("Digite o denominador: ");
				int den = sc.nextInt();
				
				int divExata = num / den;
				System.out.println("A divisão exata desses números é igual a " + divExata);
			}
			
			catch (InputMismatchException e) {
				System.out.println("Isso não é um número!");
			}
			
			catch (ArithmeticException e) {
				System.out.println("O denominador deve ser diferente de zero!");
			}
			
			finally {
				System.out.println("Programa encerrado!");
			}
	
	}
}
