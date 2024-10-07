package arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int TAMANHO = 10;
		int[] numbers = new int[TAMANHO];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 2;
		}
		
		System.out.println(numbers[2]);
		
		for(int n:numbers) {
			System.out.printf("%d%n", n);
		}
	}

}
