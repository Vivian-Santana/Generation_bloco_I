package exercíciosDeRepetição;

import java.util.Scanner;

public class Exer6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, soma=0, total=0, media=0;
		 do {
			 System.out.println("Digite um número:");
			 numero = ler.nextInt();
			 
			 if (numero %3 == 0) {
				 soma += numero;
				 total++;
			 }
				
		 }while (numero !=0);
		  
		 float media1 = soma/(total -1);
		 System.out.println("A média dos números multiplos de três é:" + media1);
	}
}
