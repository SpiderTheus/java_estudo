package aula03;

public class Pessoa {
	private String nome;
	private String endereco;
	
	
	public Pessoa(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void mostrarDetalhes() {
		System.out.printf("Nome: %s\nEndereço: %s\n", getNome(), getEndereco());
	}
}
