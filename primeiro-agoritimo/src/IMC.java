
public class IMC {
	public static void main(String[] args) { 
		float peso, altura, imc;
		peso = (float) 65;
		altura = (float) 1.87;
		
		imc = peso / (altura * altura);
				
		System.out.println(imc);
		
		if(imc < 18.5) {
			System.out.println("abaixo do peso ideal");
		} else if(imc > 24.9) {
			System.out.println("acima do peso ideal");
		} else {
			System.out.println("peso ideal");
		}
	}
}
