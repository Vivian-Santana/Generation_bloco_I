package exerc�ciosDeRepeti��o;

import java.util.Scanner;

//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)


public class Exer2 {
	public static void main(String[] args) {
		System.out.println();
		Scanner ler = new Scanner(System.in);
		int numero, par = 0, impar = 0;
		
		for(int contador = 1; contador<=10; contador++) {
			System.out.println("digite um numero:");
			numero = ler.nextInt();
			
			if(numero %2==0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("N�meros pares" + par);
		System.out.println("N�mero �mpares:"+ impar);
	}
}
