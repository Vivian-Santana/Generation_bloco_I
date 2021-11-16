package laçoDeDecisão;

import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		System.out.println();
		Scanner ler = new Scanner(System.in);
		double numero, par, impar, raizQuadrada, elevarAoQuadrado;
		
		System.out.println("Digite um numero:");
		numero = ler.nextFloat();
		
		if (numero % 2== 0) {
			raizQuadrada= Math.sqrt(numero);
			System.out.println("O número é par e sua raiz quadrada é:"+ raizQuadrada);
		}
		else if (numero % 2!=0) {
			elevarAoQuadrado = (numero*numero);
			System.out.println("O número é impar e o quadrado dele é:");
		}
		
	}
}
