package la�oDeDecis�o;

import java.util.Scanner;
//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:

public class Exer3 {
	public static void main(String[] args) {
		System.out.println();
		Scanner ler= new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a sua idade:");
		idade = ler.nextInt();
		
		if(idade>=10 && idade <=14) {
			System.out.println("Categoria Infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Categoria juvenil");
		}
		else if(idade>=18 && idade <=25) {
			System.out.println("Categoria adulto");
		}
		
	}

}
