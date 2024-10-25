package mapa;

import java.util.Scanner;

public class JogoDaVelha {

    static char[][] tabuleiro = { {'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'} };
    static char jogador = 'X';

    public static void main(String[] args) {
        boolean jogo = true;
        Scanner sc = new Scanner(System.in);

        while (jogo) {
            imprimirTabuleiro();
            System.out.println("Jogador " + jogador + ", escolha a linha (0, 1 ou 2):");
            int linha = sc.nextInt();
            System.out.println("Escolha a coluna (0, 1 ou 2):");
            int coluna = sc.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posição inválida. Tente novamente.");
                continue;
            }

            if (tabuleiro[linha][coluna] == '-') {
                tabuleiro[linha][coluna] = jogador;
                if (verificarVencedor()) {
                    imprimirTabuleiro();
                    System.out.println("Jogador " + jogador + " venceu!");
                    jogo = false;
                } else if (verificarEmpate()) {
                    imprimirTabuleiro();
                    System.out.println("O jogo terminou em empate!");
                    jogo = false;
                } else {
                    alternarJogador();
                }
            } else {
                System.out.println("Campo já preenchido. Tente novamente.");
            }
        }
        sc.close();
    }

    public static void imprimirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void alternarJogador() {
        jogador = (jogador == 'X') ? 'O' : 'X';
    }

    public static boolean verificarVencedor() {
     
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }
  
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }
        
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }
    public static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
