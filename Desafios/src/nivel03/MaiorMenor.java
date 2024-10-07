package nivel03;

public class MaiorMenor {
	
	public static void main(String[] args) {
		int[] num={4, 2, 2, 50, 20, 34, 21, 13, 98, 10};
		int maior = num[0], menor = num[0];
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] > maior) {
				maior = num[i];
			} else if(num[i] < menor){
				menor = num[i];
			}
		}
		System.out.println("Maior: " + maior + " Menor: " + menor);
	}
}
