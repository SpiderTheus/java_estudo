package aula03;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String le;
	public PessoaJuridica(String nome, String endereco, String cnpj, String le) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.le = le;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getLe() {
		return le;
	}
	public void setLe(String le) {
		this.le = le;
	}
	@Override
	public void mostrarDetalhes() {
		super.mostrarDetalhes();
		System.out.printf("\nCnpj: %s \n Le: %s", getCnpj(), getLe());
		
	}
	
	
	
	
}
