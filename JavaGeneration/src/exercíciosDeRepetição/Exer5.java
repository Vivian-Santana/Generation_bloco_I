package exercíciosDeRepetição;

import java.util.Scanner;

public class Exer5 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero=0, soma=0;
		
		do {
			System.out.println("Digite um número:");
			numero = ler.nextInt();
			soma += numero;
		}while(numero!=0);
		System.out.println("o resultado dos números somados é:"+ soma);
}
}
