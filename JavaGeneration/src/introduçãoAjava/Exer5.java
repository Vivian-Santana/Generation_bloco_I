package introduçãoAjava;

import java.util.Scanner;

public class Exer5 {
	public static void main(String args[]) 
	{
		Scanner ler = new Scanner(System.in);
		float nota1= 0, nota2 = 0, nota3 = 0, mediaPonderada;
		
		System.out.println("Digite a primeira nota:");
		ler.hasNextFloat();
		
		System.out.println("Digite a segunda nota:");
		ler.hasNextFloat();
		
		System.out.println("Digite a terceira nota:");
		ler.hasNextFloat();
		
		mediaPonderada = (nota1*2)+(nota2*3)+(nota3*5)/10;
		System.out.println("A média final é:"+ mediaPonderada);
	}
	
}
