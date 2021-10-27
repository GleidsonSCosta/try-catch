package tratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite alguns nomes: ");
			String vetor[] = sc.nextLine().split(" ");
		
			System.out.println("digite um valor para acessar a posição desejada: ");
			int posicao = sc.nextInt();
		
			System.out.println(vetor[posicao]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
		}
		catch(InputMismatchException e) {
			System.out.println("Valor inválido");
		}
		System.out.println("Fim do Programa");
			
		sc.close();
	}

}
