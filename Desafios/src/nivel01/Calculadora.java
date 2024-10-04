package nivel01;
import java.util.Scanner;

public class Calculadora {
	/* receba dois números e realize as 
	quatro operações básicas: adição, subtração, 
	multiplicação e divisão.*/

	
	public static void main(String[] args) {
		int x, y;
		int som, sub, mut;
		double div;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("digite um número: ");
		x = sc.nextInt();
		System.out.println("digite outro número: ");
		y = sc.nextInt();
		
		som = x + y;
		sub = x - y;
		mut = x * y;
		
		div = (double) x / y;
		
		System.out.println("soma: "+ som);
		System.out.println("subtração: "+ sub);
		System.out.println("mutiplicação: "+ mut);
		
		// esse printF formata
		System.out.printf("Divisão: %.2f%n", div);
		//System.out.println("divisão: %.2f%n"+  div);
		
		sc.close();
	}
}
