package aula01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("oi cliente");
		
		Cliente cliente1;
		
		cliente1 = new Cliente(1, "matheus ", "math@gmail.com ", "739888410");
		
		cliente1.setNome("João ");
		System.out.println(cliente1.getNome() + cliente1.getEmail() + cliente1.getTelefone());
		
		
	}

}
