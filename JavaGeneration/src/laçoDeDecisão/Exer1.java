package la�oDeDecis�o;

import java.util.Scanner;

public class Exer1 {
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3;

		System.out.println("Digite um n�mero:");
		numero1 = ler.nextInt();
		ler.nextLine();
		System.out.println("Digite um n�mero:");
		numero2 = ler.nextInt();
		ler.nextLine();
		System.out.println("Digite um n�mero:");
		numero3 = ler.nextInt();

		if (numero1 > numero2 && numero1 >numero3){
			System.out.println("O n�mero maior �:" + numero1);
		}
		else if (numero2 > numero1 && numero2> numero3){
			System.out.println("o n�mero maior �:" + numero2);
		}
		else if (numero3 > numero1 && numero3 > numero2){
			System.out.println("o n�mero maior �:" + numero3);
		}
			
	}

}
