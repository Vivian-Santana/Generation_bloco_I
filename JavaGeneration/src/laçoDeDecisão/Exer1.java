package laçoDeDecisão;

import java.util.Scanner;

public class Exer1 {
//Faça um programa que receba três inteiros e diga qual deles é o maior.

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero1, numero2, numero3;

		System.out.println("Digite um número:");
		numero1 = ler.nextInt();
		ler.nextLine();
		System.out.println("Digite um número:");
		numero2 = ler.nextInt();
		ler.nextLine();
		System.out.println("Digite um número:");
		numero3 = ler.nextInt();

		if (numero1 > numero2 && numero1 >numero3){
			System.out.println("O número maior é:" + numero1);
		}
		else if (numero2 > numero1 && numero2> numero3){
			System.out.println("o número maior é:" + numero2);
		}
		else if (numero3 > numero1 && numero3 > numero2){
			System.out.println("o número maior é:" + numero3);
		}
			
	}

}
