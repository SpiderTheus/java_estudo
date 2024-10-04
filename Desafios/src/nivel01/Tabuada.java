package nivel01;
import java.util.Scanner;


public class Tabuada {
	/* Faça um programa que 
	 * mostre a tabuada de um número 
	 * digitado pelo usuário.
	 */
	
	public static void main(String[] args) {

		int  num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		
		System.out.println("Tabuada de multiplicação " + num + ":");
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		};
		
		sc.close();
	}

}
