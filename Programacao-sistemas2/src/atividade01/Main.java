package atividade01;
// classe de exercução
public class Main {			
	public static void main(String[] args) {
		Carro gol = new Carro("volks", "g2", 96, 2);
		Moto pop = new Moto("honda", "pop100", 20, false);
		
		gol.exibirDetalhes();
		pop.exibirDetalhes();
	}

}
