package aula03;

public class Main {

	public static void main(String[] args) {
		String teste = "1";
		String teste2 = "1";
		
		if(teste.equals(teste2)) {
			System.out.println("é");
		}
		
		
		
		
		PessoaFisica cliente = new PessoaFisica("Matheus", "roça", "391.325.426-14", "Solteiro");
		PessoaJuridica empresa = new PessoaJuridica("Spider tech", "Rua lalala", "4152.365.65", "sei la");
		
		cliente.mostrarDetalhes();
		empresa.mostrarDetalhes();
		
	}

}
