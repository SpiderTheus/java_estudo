package atividade01;
//sub classe
public class Moto extends Veiculo {
	
	private boolean temSidecar;
	
	
	public Moto(String marca, String modelo, int ano, boolean temSidecar) {
		super(marca, modelo, ano);
		this.temSidecar = temSidecar;
	}
	
	@Override 
	public void exibirDetalhes() {
		super.exibirDetalhes();
		if(temSidecar) {
			System.out.println("Tem sidecar");
		}	else {
			System.out.println("Não tem sidecar");
		}
	}
}
