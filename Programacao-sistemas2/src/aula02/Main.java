package aula02;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Saida de dados e setando
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo:");
		String nome = sc.nextLine();
		System.out.println("Digite sua Idade:");
		int idade = sc.nextInt();
		System.out.println("Digite sua altura:");
		double altura = sc.nextDouble();
		
		System.out.print("O nome completo é: " + nome + "\n");
		System.out.println("Idade: " + idade);
		System.out.printf("E a sua altura é de: %.2f", altura);
		
		System.out.printf("\nOlá, %s! Você tem %d anos, e %.2fm.", nome, idade, altura);
		
		sc.close();

	}

}
