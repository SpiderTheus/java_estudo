package nivel01;
import java.util.Scanner;

public class ImPar {
	/* Escreva um programa que receba 
	 * um número do usuário e informe se ele 
	 * é par ou ímpar.
	 */
		
	
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite um número: ");
		num = sc.nextInt();
		
		if(num % 2 != 0) {
			System.out.println("Esse número é impar");

		} else {
			System.out.println("Esse número é par");
		}
		
		sc.close();
	}

}
