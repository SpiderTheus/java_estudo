package Desafios09_10;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	// (+, -, *, /)
	private char c;
	private double x, y;
	Scanner sc = new Scanner(System.in);
	
	public void usuarioCalculadora () {
		boolean ver = false, val = false, divZero = false;
		while (!ver) {
			try {
				System.out.println("Digite um numero: ");
				this.setX(sc.nextDouble());
				
				while (!val) {
					System.out.print("Escolha a operação (+, -, *, /): ");
					char car = sc.next().charAt(0);
					if(!val) {
						if (car == '+' || car == '-' || car == '*' || car == '/') {
						    // Operação válida
							setC(car);
							val = true;
						} else {
							System.out.println("ERROR: operação invalida");
						}
					}
				}
				while(!divZero) {
					double yVer;
					System.out.println("Digite outro numero: ");
					yVer = sc.nextDouble();
					if(yVer == 0) {
						System.out.println("ERROR: não é possivel divição por 0");
					} else {
						setY(yVer);
						ver = true;
						divZero = true;
						break;
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("ERRO: cammpo invalido, por favor digite novamente:");
				sc.nextLine();
			}
		}
	
		calc(c, x, y);
		sc.close();
	}
	
	public void calc(char c, double x, double y){
		switch(c) {
		case '+': 
			System.out.println("A soma é: " + soma(x, y));
			break;
		case '-':
			System.out.println("A subtração é: " + subt(x, y));
			break;
		case '*':
			System.out.println("A mutiplicação é: " + mult(x, y));
			break;
		case '/':
			
			System.out.println("A divição é: " + divi(x, y));
			break;
		default:
			System.out.println("operação inexistente");
			break;
		}
	}
	
	
	public double soma(double x, double y) {
		return (x + y);	
	}
	
	public double subt(double x, double y) {
		return (x - y);	
	}
	
	public double mult(double x, double y) {
		return (x * y);	
	}
	
	public double divi(double x, double y) {
		return (x / y);	
		
	
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}
	
	
}
