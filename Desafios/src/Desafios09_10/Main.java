package Desafios09_10;
import java.util.InputMismatchException;
import java.util.Scanner;
// tratar as exerções
public class Main {

	public static void main(String[] args) {
		// menu
		Scanner sc = new Scanner(System.in);
		int escolha = 0;
		boolean verificacao = false;
		
		Calculadora calculadora = new Calculadora();
		System.out.println("*-- Escolha o programa: --*");
		System.out.println("*-- 1 - Calculadora --*"); // feita
        System.out.println("*-- 0 - Sair --*");
		while(!verificacao) {
			try {
					System.out.print("Digite a sua escolha: ");
					escolha = sc.nextInt();
					if(escolha == 1) {
						verificacao = true;
					} else if(escolha == 0){
						System.out.println("Encerrando o problema!");
						verificacao = true;
					} else {
						System.out.println("Não tem escolha com esse número.");
	                }
	                
				
			} catch (InputMismatchException e) {
				System.out.println("ERRO: Digito invalido, por favor digite novamente (somente número inteiros):");
				sc.nextLine();
			}
		}
		
		switch(escolha) {
		case 1:
			System.out.println("*-- Calculadora --*");
			calculadora.usuarioCalculadora();
			break;
		case 0:
            
            System.out.println("Programa finalizado.");
            break;
		
		}
		sc.close();
	}

}
