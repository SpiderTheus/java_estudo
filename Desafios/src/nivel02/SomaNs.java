package nivel02;
import java.util.Scanner;

public class SomaNs {

	public static void main(String[] args) {
		int number;
		int soma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		number = sc.nextInt();
		
		for(int i = 1; i <= number; i++) {
			soma += i;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
