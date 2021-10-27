package tratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite alguns nomes: ");
			String vetor[] = sc.nextLine().split(" ");
		
			System.out.println("digite um valor para acessar a posi��o desejada: ");
			int posicao = sc.nextInt();
		
			System.out.println(vetor[posicao]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o inv�lida");
		}
		catch(InputMismatchException e) {
			System.out.println("Valor inv�lido");
		}
		System.out.println("Fim do Programa");
			
		sc.close();
	}

}
