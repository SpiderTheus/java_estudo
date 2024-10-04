package nivel02;
import java.util.Scanner;

public class ContagemPrimo {
	/* Crie um programa que receba um número 
	 * e exiba todos os números primos entre 1 e esse número.
	 */
	
	
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		System.out.println("Números primos entre 1 e " + num + ": ");
	
		for(int i = 2; i <= num; i++) {
			if (isPrimo(i)) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}
	
	public static boolean isPrimo(int numero) {
		if(numero < 2) {
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(numero); i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
