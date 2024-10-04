package POO;


public class Objetos {
	public static class Animal {
		private String nome;
		private String especie;
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getEspecie() {
			return especie;
		}
		public void setEspecie(String especie) {
			this.especie = especie;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal cachorro = new Animal();
		
		cachorro.setNome("Julie");
		cachorro.setEspecie("Canídeo");
		
		Animal cavalo = new Animal();
		cavalo.setEspecie("Équino");
		cavalo.setNome("furacão");
		
		System.out.println(cachorro.getNome() + " é um " + cachorro.getEspecie());
		System.out.println(cavalo.getNome() + " é um " + cavalo.getEspecie());
	}

}