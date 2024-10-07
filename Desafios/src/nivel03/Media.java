package nivel03;

public class Media {
	static public float CalcularMedia(float[] arr) {
		float soma = 0, media;
		
		for(int i = 0; i < arr.length; i++) {
			soma += arr[i] ; 
		}
		media = soma / arr.length;
		
		return media;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] mediaAlunos= {7.5f, 8.0f, 9.2f, 6.3f, 7.8f};
		
		System.out.printf("A média é: %.2f", CalcularMedia(mediaAlunos));
			
	}

}
