package aula01;
import java.util.Scanner;

public class fundamentos {

	public static void main(String[] args) {
		// scanner
		Scanner sc = new Scanner (System.in);
		String nome;
		float peso;
		float altura;
		
		System.out.print("Digite seu nome completo: ");
		 nome = sc.nextLine();
		 
		System.out.print("Qual seu peso: ");
		 peso = sc.nextFloat();
		 
		System.out.print("Qual sua altura: ");
		 altura = sc.nextFloat();
		
		 float imc = peso / (altura * altura);
		 String condicao;
		 
		 if(imc < 18.5) {
				condicao = "abaixo do peso ideal";
			} else if(imc > 24.9) {
				condicao = "acima do peso ideal";
			} else {
				condicao = "peso ideal";
			}
		 
		 
		 System.out.print(nome + ", O seu IMC é de: " + imc + ", " + condicao + ".");
		
		sc.close();
	}

}
