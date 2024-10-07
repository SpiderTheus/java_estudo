package atividade01;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Main {
    
    // Método para gerar um número aleatório dentro do intervalo
    public static int GerarNumero(int[] arr) {
        Random gerador = new Random();
        return gerador.nextInt(arr[1] - arr[0] + 1) + arr[0];
    }

    public static void main(String[] args) {
        final int TAMANHO = 2;
        int[] intervalo = new int[TAMANHO]; 
        int numeroAleatorio = 0;
        int tentativas = 0;  
        boolean acertou = false, entradaValida = false; 
        Scanner sc = new Scanner(System.in);
        
        // Requisito 1: Definição do intervalo
        System.out.println("Defina o intervalo dos números:");
        // Tratamento de exerções 1
        while(!entradaValida) {
        	try {
            	System.out.print("De: ");
                intervalo[0] = sc.nextInt();
                System.out.print("Até: ");
                intervalo[1] = sc.nextInt();
                if(intervalo[0] >  intervalo[1]) {
                	System.out.println("ERRO: o limite inferior é maior que o limite superior.");
                	System.out.println("digite outro valor:");
                } else {
                	entradaValida = true;
                }
            } catch(InputMismatchException e)
            {
            	System.out.println("ERROR: intervalo invalido, digite apenas números inteiros");
            	sc.nextLine();
            }
        }
        
        
        // Requisito 2: Geração de número aleatório
        numeroAleatorio = GerarNumero(intervalo);
        System.out.println("Número aleatório gerado! Tente adivinhar.");

        // Requisito 3: Entrada do jogador e fornecimento de dicas
        while (!acertou) {
        	// tratamento de exerção 2
        	int tentativa = 0;
        	try {
        		System.out.print("Digite sua tentativa (ou -1 para sair): ");
        		System.out.println("Número de tentativas: " + tentativas);
        		tentativa = sc.nextInt();
        	} catch (InputMismatchException e) {
        		System.out.println("ERROR: número invalido, digite apenas números inteiros");
            	sc.nextLine();
        	}
             	
            // Requisito 5: Opção de sair
            if (tentativa == -1) {
                System.out.println("Jogo encerrado.");
                break;
            }
            
            tentativas++;  
            
            if (tentativa == numeroAleatorio) {
                acertou = true;
                System.out.println("*- Parabéns! Você acertou o número. -*");
                System.out.println("*- Tentativas: " + tentativas);
            } else if (tentativa < numeroAleatorio) {
                System.out.println("O número gerado é maior.");
            } else {
                System.out.println("O número gerado é menor.");
            }
        }
        
        // Requisito 6: Mensagem de encerramento
        if (acertou) {
            System.out.println("*- Fim do jogo. Você acertou em " + tentativas + " tentativas. -*");
        }
        
        sc.close(); 
    }
}
