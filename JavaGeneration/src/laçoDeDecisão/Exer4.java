package la�oDeDecis�o;

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
			System.out.println("O n�mero � par e sua raiz quadrada �:"+ raizQuadrada);
		}
		else if (numero % 2!=0) {
			elevarAoQuadrado = (numero*numero);
			System.out.println("O n�mero � impar e o quadrado dele �:");
		}
		
	}
}
