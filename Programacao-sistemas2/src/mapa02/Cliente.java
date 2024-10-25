package mapa02;

public class Cliente {
	
	private static int sequence = 0;
	
	private int id;
	private String nome;
	private String email;
	private String telefone;
	
	public Cliente(String nome, String email, String telefone) {
		this.id = sequence++;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void exibirDetalhes() {
		System.out.println(" ");
		System.out.println("ID:"+getId());
		System.out.println("Nome:"+getNome());
		System.out.println("Email:"+getEmail());
		System.out.println("Telefone:"+getTelefone());
		System.out.println(" ");
	}

}
