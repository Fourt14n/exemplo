package sistema;
import java.util.Scanner;
import java.util.Random;

public class ImparOuPar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rdm = new Random();
		
		int opcao = 0;
		do {
			System.out.println("Jogar?");
			System.out.println("1 -- Sim");
			System.out.println("9 -- Não");
			opcao = input.nextInt();			
			if(opcao == 1) {
				System.out.println("Digite um número ímpar ou par, e compararemos com o número gerado por nosso chatoGPT");
				
				int numeroDigitado = input.nextInt();
				int numeroGerado = rdm.nextInt(100)+1;
				
				if(numeroGerado % 2 == 0 && numeroDigitado % 2 == 0) {
					System.out.println("Parabéns, é par");
					
				}else if(numeroGerado % 2 != 0 && numeroDigitado % 2 != 0) {
					System.out.println("Parabéns, é ímpar");
					
				}else {
					System.out.println("Errou, otário!");
				}
			}
		} while (opcao != 9);
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
